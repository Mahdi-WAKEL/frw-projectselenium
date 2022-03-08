@buzz
Feature: post what in your mind
  ETQ utilisateur je souhaite ajouter des post sur le menu buzz de l'application OrangeHRM

  Background: 
    Given Je me connecte sur l'application OrangeHRM
    When Je saisis le username "Admin"
    And Je saisis le password "admin123"
    And Je clique sur le boutton LOGIN

  @post-buzz
  Scenario: Post what in your mind
    #Given Je suis déjà connecté(e) sur l'application OrangeHRM
    When Je clique sur le menu buzz
    And Je saisis le message "we are the best team" sur le champ what in your mind
    And Je clique sur le boutton Post
    Then Je verifie si le message "we are the best team" est bien parmis la liste des post
