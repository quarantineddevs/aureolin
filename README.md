Source code for an RPG game.
- To run the game, type "java -jar asmura.jar" in terminal. Must be `Java` 13, NOT 14.
- The application opens with a black background (menu screen). To enter "main game", press enter (white background), and press q to toggle between main game and escaped screen (gray background).
- The player is represented by an orange square and movable with WASD only in the main screen.
(FOR DEVS) To fix merge conflicts with `asmura.jar`, be on the branch with conflicts and pull from whatever remote you have this as. Then, to fix the conflicts in Eclipse, select Export > Java > Runnable JAR file, with launch configuration Asmura - xyz, where xyz if the name of the folder the project is in. And if abc is the file path with that folder, select export to abc/asmura.jar .
