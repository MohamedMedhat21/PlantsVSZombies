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

  ![Welcome Screen](https://drive.google.com/file/d/1eIFSWwzNISH6x0-5Nj1xyFhgLEFATonu/view)

* The game starts with 5 rows and 5 lawn mowers in each row, also initially having 50 suns that will later help in buying sunflowers and peashooters. Also, the score will be incremented when killing a zombie.

  ![Starting Screen](https://drive.google.com/file/d/1aU9tN3s2mi5jUT_PMiwZuGhNPkVD3c8P/view)

* Random Suns fall and you can click on them to increase the amount of suns you have. also sunflower produces suns that you can also collect. The zombies numbers increases as time passes that will make it harder to kill all the zombies coming without placing enough peashooters in advance. 

  ![Normal Game Screen](https://drive.google.com/file/d/1bjwfjHfhuv2yG3DTeFBEbUapOB0QSvyV/view)

* Lawn Mower starts moving once a zombie approaches it, it also kills every zombie it finds in its way.

   ![Lawn Mower](https://drive.google.com/file/d/10Zoo7nog0XXbijuHHzafgtTVcfMW97-g/view)

* if a zombie got close to the house and there is no lawn mower to defend the lane, the zombie will enter the house resulting in losing the game.

  ![No Lawn Mower](https://drive.google.com/file/d/1eSIVn9qAuqEda2zWrvlOJGCRHMk2zcLd/view)

* Game Over shows the total number of the killed zombies during the game

  ![Game Over](https://drive.google.com/file/d/18GbO7oyuQg7dgvjGDseB6WYkf58_tc3y/view)