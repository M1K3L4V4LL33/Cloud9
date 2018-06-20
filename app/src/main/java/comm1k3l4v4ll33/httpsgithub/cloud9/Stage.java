package comm1k3l4v4ll33.httpsgithub.cloud9;


/**
 * Created by m.lavallee on 06/20/2018
 */

public class Stage {

    public String name;
    public String description;
    public int imageResourceId;

    public static final Stage[] stages = {
            new Stage("MainStage", "This Stage is the biggest, its where the biggest artists play", R.drawable.mainstage),
            new Stage("Everest", "This is for more heavy hitting beats happen", R.drawable.evereststage),
            new Stage("LiveStage", "A bunch of artists of different genres play at this stage", R.drawable.livestage),
            new Stage("Empire", "This stage has some range from deep house to Trance to Hardstyle", R.drawable.empire),
            new Stage("NewComers Stage", "This is where the new boys come to throw down", R.drawable.newcomers)
    };


    /**
     * Stage is the constructor for objects of type stage that stores
     * a name, a description, and an image resource ID for each stage
     * @param stageName is the name of the stage
     * @param stageDescription is the description of the drink
     * @param stageImageResourceId is the image of the stage
     * @return an object of class Stage
     */
    public Stage( String stageName, String stageDescription, int stageImageResourceId )
    {
        name = stageName;
        description = stageDescription;
        imageResourceId = stageImageResourceId;
    }

    /**
     * getName returns the name of stage
     * @param "" There are no parameters
     * @return a String representing the name of stage
     */
    public String getName()
    {
        return name;
    }

    /**
     * getDescription returns the description of drink
     * @param "" there are no parameters
     * @return a String representing the description of the drink
     */
    public String getDescription()
    {
        return description;
    }

    public int stageImageResourceId()
    {
        return imageResourceId;
    }

    /**
     * toString returns a string rep. of the data held inside
     * the Stage class
     *
     * @param "" there are no parameters
     * @return a String representing the data withen each stage
     */
    public String toString()
    {
        return this.name;
    }
}
