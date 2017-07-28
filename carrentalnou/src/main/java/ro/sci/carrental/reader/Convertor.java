package ro.sci.carrental.reader;


/**
 * Created by Roronoa on 7/13/2017.
 */
public interface Convertor <T> {
    T convert(String convertedString) throws InvalidEntityException;

}
