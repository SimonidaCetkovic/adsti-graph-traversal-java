import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import org.junit.Assert;

public class GraphTest{
    @Test
    public void GraphTraversal_varyingLengthWords_returnOrderedWords(){
    //Arrange
    Node catNode = new Node(true);
    Node catsNode = catNode.setChild('s', true);
    Node catcNode = catNode.setChild('c', false);
    Node catchNode = catcNode.setChild('h', true);
    Node cateNode = catNode.setChild('e', false);
    Node caterNode = cateNode.setChild('r', true);

    //Act
    List<String> result = GraphTraversal.collectWords("cat", catNode);

    //Assert
    Assert.assertEquals(Arrays.asList("cat", "cats", "catch", "cater"), result);
  }
}
