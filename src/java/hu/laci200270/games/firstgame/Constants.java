package hu.laci200270.games.firstgame;

import hu.laci200270.games.firstgame.utils.CommonUtils;
import hu.laci200270.games.firstgame.utils.FileUtils;

import java.io.File;

/**
 * Created by Laci on 2016. 01. 23..
 */
public class Constants {

    //LWJGL
    public static final String lwjgl_url="http://downloads.sourceforge.net/project/java-game-lib/Official%20Releases/LWJGL%202.9.3/lwjgl-2.9.3.zip?r=http%3A%2F%2Fsourceforge.net%2Fprojects%2Fjava-game-lib%2Ffiles%2FOfficial%2520Releases%2FLWJGL%25202.9.3%2F&ts=1453574719&use_mirror=netix";
    public static final String lwjgl_version="2.9.3";
    public static final File lwjgl_zip=new File(FileUtils.getTempDir(),"lwjgl.zip");
    public static final File lwjgl_dir=new File(FileUtils.getRootDir(),"lwjgl");
    public static final File lwjgl_unpacked_dir=new File(lwjgl_dir, CommonUtils.generateLwjglName());
    public static final File lwjgl_natives_dir=new File(lwjgl_unpacked_dir,"natives");


}
