package com.github.chabanenk0.Shapes;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by dchabanenko on 09.11.16.
 */
interface InputableInterface
{
    /**
     * Interface for input the data from stream (console or files)
     * @param reader
     * @param outputQuestions
     */
    public void inputFromStream(InputStream reader, boolean outputQuestions, OutputStream consoleOut);
}
