package com.smartling.api.sdk.file.commandline;

public class RetrieveFileParams extends BaseFileParams
{
    private String pathToFile;
    private String locale;
    private String pathToStoreFile;

    public String getPathToFile()
    {
        return pathToFile;
    }

    public void setPathToFile(String getPathToFile)
    {
        this.pathToFile = getPathToFile;
    }

    public String getLocale()
    {
        return locale;
    }

    public void setLocale(String locale)
    {
        this.locale = locale;
    }

    public String getPathToStoreFile()
    {
        return pathToStoreFile;
    }

    public void setPathToStoreFile(String pathToStoreFile)
    {
        this.pathToStoreFile = pathToStoreFile;
    }
}
