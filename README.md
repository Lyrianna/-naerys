# Enaerys
Creating a mod for a minecraft server with Java
Idea :
- faire une roulette pour les sorts, avec un nombre de slots limité.
- 6 elements : feu, terre, eau, vent, tenebre et lumiere
- Un choix sera proposé à partir d'un certain niveau entre les tenebres et la lumiere puis plus tard entre l'offensive ou la defensive.
- création de "scrolls" pour les spells
- définir les différents spells pour chaque éléments.
- Ajouter une barre de mana pour les staffs

Sehn : 
- Definir des spells pour les éléments
- a définir entre nous : nombre de spells, nombre de niveau, nombre de spells défensif et offensif.

Kei : 
- Definir des spells pour les éléments
- a définir entre nous : nombre de spells, nombre de niveau, nombre de spells défensif et offensif.

Lyriana :
- Definir des spells pour les éléments
- a définir entre nous : nombre de spells, nombre de niveau, nombre de spells défensif et offensif.

print("Bienvenue dans ce selecteur de formule, choisisez celle désirée")
x = int(input("1-> U 2-> R 3-> I"))
if x == 1:
    a = int(input("Entrez R"))
    b = int(input("Entrez I"))
    print("U =",a*b)
if x == 2:
    a = int(input("Entrez U"))
    b = int(input("Entrez I"))
    print("U =",a/b)
if x == 3:
    a = int(input("Entrez U"))
    b = int(input("Entrez R"))
    print("U =",a/b)