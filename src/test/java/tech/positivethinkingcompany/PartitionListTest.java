package tech.positivethinkingcompany;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PartitionListTest {

    @Test
    public void partitionWithEmptyListTest() {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> subList = PartitionList.partition(list, 2);
        Assert.assertEquals(subList.size(), 0);
    }

    @Test
    public void partitionWithSizeListEqualOrSmallerThanSizeEntryTest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<List<Integer>> subList = PartitionList.partition(list, 6);
        Assert.assertEquals(subList.size(), 1);
        Assert.assertEquals(subList.get(0), list);
    }

    @Test
    public void partitionWithSizeListBiggerThanSizeEntryTest() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<List<Integer>> subList = PartitionList.partition(list, 2);
        Assert.assertEquals(subList.size(), 3);
        Assert.assertEquals(subList.get(0), new ArrayList<>(Arrays.asList(1,2)));
        Assert.assertEquals(subList.get(1), new ArrayList<>(Arrays.asList(3,4)));
        Assert.assertEquals(subList.get(2), new ArrayList<>(Collections.singletonList(5)));
    }

    @Test
    public void partitionWithSizeStringListBiggerThanSizeEntryTest() {
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c","d","e"));
        List<List<String>> subList = PartitionList.partition(list, 3);
        Assert.assertEquals(subList.size(), 2);
        Assert.assertEquals(subList.get(0), new ArrayList<>(Arrays.asList("a","b", "c")));
        Assert.assertEquals(subList.get(1), new ArrayList<>(Arrays.asList("d","e")));
    }
}
