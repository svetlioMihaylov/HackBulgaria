package impl;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReducePath {
    public static Path reducePath(Path p)
    {
        return p.normalize();
    }
public static void main(String[] args) {
    Path p=Paths.get("first", "sec","..","third");
    System.out.println(ReducePath.reducePath(p));
}
}
