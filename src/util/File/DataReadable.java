package util.File;

import java.util.List;

public interface DataReadable <T>{
    List<T> readDataFromDBSQL();
}