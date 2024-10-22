package com.SpringCourse.SpringCore.common;

public class FancyWriter implements TextWriter
{
    @Override
    public String WriteText(String someText)
    {
        return someText + " but Fancy";
    }
}
