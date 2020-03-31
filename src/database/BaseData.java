package database;

import database.information.DataType;

/**
 * @author Zixuan Zhang
 */
public abstract class BaseData {
    private final String addr = "";
    String contents = "";

    /**
     * This is the method which used to load information for a DataType class.
     * @return A type of DataType.
     */
    public abstract DataType loadInfo();
    /**
     * This is a method that help you to save data information into database.
     * @param dataType Input the DataType which you want to store.
     */
    public abstract void saveInfo(DataType dataType);
}
