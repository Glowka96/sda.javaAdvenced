package collections.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class MyArrayListTest extends ListTest{

    public MyArrayListTest() {
        super(new MyArrayList<>());
    }
}
