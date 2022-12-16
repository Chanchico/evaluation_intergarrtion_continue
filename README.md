# Gestion Navale

Cette application est une application permettant la gestion des passagers de vos navires.

Vous pouvez assurer la sécurité de vos passagers en évitant que des clandestins ne montent dans vos navires

Un système de prison est également mis en place
## Projet Maven
> ### Dépendances
>> Junit java

## Hooks
Pour avoir accès au hooks depuis le dossier .githooks (seulement disponible pour la version git >= 2.9)

`git config core.hooksPath .githooks`
> ### pre-commit
>> Vérifie que l'utilisateur git qui fait le commit, possède la même adresse email que celle renseignée dans le fichier 'pre-commit.sh'
> ### pre-push
>> Lorsqu'il push directement sur la branche principale (main), l'utilisateur doit effectuer une vérification supplémentaire pour éviter tout problème


