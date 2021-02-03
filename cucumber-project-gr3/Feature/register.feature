
Feature: Регистрация на потребител

  Scenario Outline: Регистрация на потребител
    Given Потребителя отваря екрана за регистация
    When Въвдеде потребителско име "<username>"
    And Въвдеде първа парола "<password1>"
    And Въвдеде втора парола "<password2>"
    And Въвдеде email "<email>"
    And Натисне бутона за регистрация
    Then Въжда съобщение "<expectedMessage>"

    Examples: 
      | username  | password1 | password2  |email					|expectedMessage|
      | name1 		|    pass 	| pass  	  	|test@test.com|Успешно се регистрирахте|
      | name1 		|    pass 	| pass123  		|test@test.com|Въведете еднакви пароли|
      | name1 		|    pass123 	| pass  		|test@test.com|Въведете еднакви пароли|
      | name2 		|    pass123 	| pass123  		|test@test.com|Потребителското име е заето|
      | name1 		|     	|   pass		|test@test.com|Въведете парола|
      | name1 		|    pass 	|   		|test@test.com|Потвърдете паролата|
      |  		|    pass123 	| pass  		|test@test.com|Въведете потребителско име|
      | name1 		|    pass123 	| pass  		||Въведете електронна поща|
