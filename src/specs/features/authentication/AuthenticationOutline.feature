@authentification-outline
Feature: Authentification - OrangeHRM
  ETQ utilisateur je souhaite m'authentifier avec un scenario outline

  @outline
  Scenario Outline: Authentification avec un scenario outline
    Given Je me connecte sur l'application OrangeHRM
    When Je saisis le username "<username>" 
    And Je saisis le password "<pswd>" 
    #Then Je me redirige vers la page home "Bienvenue"

    Examples: 
      | username  | pswd      | Etat    | 
      | Admin     | admin123  | success | 
      | Mahdi     | admin000  | Fail    | 
