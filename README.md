# Plants VS Zombies

A simple Plants VS Zombies game.

- Implemented using libGDX - java
- Implemented plants:
  - Sunflower Plant *(produces suns to collect)*
  - Peashooter Plant *(shoots peas to kill the zombie)*
- Implemented Zombies:
  - Regular Zombie
  - Bucket-Head Zombie

* Implemented Lawn Mowers *(to defend the house if a zombie approaches it)*
* Implemented Random Falling Sun

## To Run The Game

###### if you're using IntelliJ:

1. Click *View* tab -> *Tool Windows* -> *Project*
2. Go to *desktop* -> *src* -> *com.uni4team.desktop* -> *DesktopLauncher*
3. Right click on *DesktopLauncher* -> *Run 'DesktopLauncher.main()'*

###### if you're still having problems running the project, try making the run configurations by yourself:

1. Click *Run* tab -> *Edit Configurations*
2. Click *'+'*  -> *Application*
3. In the *'Main class:*' -> Click on *DesktopLauncher*
4. In the *'Use classpath of module:'* -> Choose *PlantsVSZombies.desktop.main*
5. Finally, Click *OK*

You should be able to run the project now.

## Demo

The game includes:

* A welcome screen to start the project

  <img src="https://raw.githubusercontent.com/MohamedMedhat21/PlantsVSZombies/master/screenshots/Welcome.png" alt="Welcome Screen" style="zoom: 67%;" />

* The game starts with 5 rows and 5 lawn mowers in each row, also initially having 50 suns that will later help in buying sunflowers and peashooters. Also, the score will be incremented when killing a zombie.

  <img src="https://raw.githubusercontent.com/MohamedMedhat21/PlantsVSZombies/master/screenshots/Starting.png" alt="Starting Screen" style="zoom:67%;" />

* Random Suns fall and you can click on them to increase the amount of suns you have. also sunflower produces suns that you can also collect. The zombies numbers increases as time passes that will make it harder to kill all the zombies coming without placing enough peashooters in advance. 

  <img src="https://raw.githubusercontent.com/MohamedMedhat21/PlantsVSZombies/master/screenshots/NormalGame.png" alt="Normal Game Screen" style="zoom:67%;" />

* Lawn Mower starts moving once a zombie approaches it, it also kills every zombie it finds in its way.

   <img src="https://raw.githubusercontent.com/MohamedMedhat21/PlantsVSZombies/master/screenshots/lawnMowerHittingAZombie.png" alt="Lawn Mower" style="zoom:67%;" />

* If a zombie got close to the house and there is no lawn mower to defend the lane, the zombie will enter the house resulting in losing the game.

  <img src="https://raw.githubusercontent.com/MohamedMedhat21/PlantsVSZombies/master/screenshots/ZombieAndNoLawnMower.png" alt="No Lawn Mower" style="zoom:67%;" />

* Game Over shows the total number of the killed zombies during the game

  <img src="https://raw.githubusercontent.com/MohamedMedhat21/PlantsVSZombies/master/screenshots/GameOver.png" alt="Game Over" style="zoom:67%;" />