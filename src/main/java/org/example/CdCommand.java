package org.example;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;

public class CdCommand implements Command{

    static private Path path = Paths.get(".");

    @Override
    public void executeCommand(HashSet<String> options, ArrayList<String> arguments) {
        if (arguments.isEmpty()) {
            setPath(".");
        } else {
            CdCommand.path = CdCommand.path.resolve(arguments.get(0));
        }
    }

    public static void setPath(String textPath) {
        CdCommand.path = Paths.get(textPath);
    }

    public static Path getPath() {
        return path;
    }
}
