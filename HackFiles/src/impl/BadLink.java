package impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class BadLink {
    public static void FindBadPaths(Path path) throws IOException
    {
        Files.walkFileTree(path,new BadFileVisitor()  );
    }
    public static void main(String[] args) throws IOException {
        BadLink.FindBadPaths(new File("D:\\junk").toPath());
    }
}
class BadFileVisitor implements FileVisitor<Path>
{

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        // TODO Auto-generated method stub
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println(file);
        if(Files.isSymbolicLink(file))
                {
            System.out.println("symbolik");
           if( !Files.readSymbolicLink(file).toFile().exists())
           {
               System.out.println(file);
           }
                }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        // TODO Auto-generated method stub
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        // TODO Auto-generated method stub
        return FileVisitResult.CONTINUE;
    }
    
}
