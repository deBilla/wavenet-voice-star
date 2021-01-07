/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimuthu
 */

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class MoveFile {
    
    public Path moveFile(String fileName) throws IOException{
        Path temp = null;
        try{
            temp = Files.move
            (Paths.get(""
                    + "/usr/local/tomcat2/work/Catalina/localhost/voice_star/eclipse/plugins/voice_star_voice.release_0.0.0/project/Media_Files/"+fileName+".wav"), 
            Paths.get("/usr/local/var/yaws/www/audio/1/voice_star/1/records/"+fileName+".wav"));
           return temp;
        }catch(FileAlreadyExistsException e){
            //System.out.println(e);
            temp = Paths.get("File already exist");
            return temp;
        }catch(NoSuchFileException e){
            //System.out.println(e);
            temp = Paths.get("No such file");
            return temp;
        }
    }
}
