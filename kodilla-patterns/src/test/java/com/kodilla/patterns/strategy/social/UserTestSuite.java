package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publishers.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publishers.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User frosting = new Millenials("Frosting B");
        User willow = new YGeneration("Willow L");
        User noah = new ZGeneration("Noah B");

        //When
        String frostingPost = frosting.sharePost();
        System.out.println("Frosting: " + frostingPost);
        String willowPost = willow.sharePost();
        System.out.println("Willow: " + willowPost);
        String noahPost = noah.sharePost();
        System.out.println("Noah: " + noahPost);

        //Then
        Assert.assertEquals("Photo shared on Facebook", frostingPost);
        Assert.assertEquals("Photo shared on Twitter", willowPost);
        Assert.assertEquals("Photo shared on Snapchat", noahPost);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User zuz = new ZGeneration("Zuzanna Lubben");

        //When
        String zuzPost = zuz.sharePost();
        System.out.println("Zuz: " + zuzPost);
        zuz.setPortal(new FacebookPublisher());
        zuzPost = zuz.sharePost();
        System.out.println("Zuz: " + zuzPost);

        //Then
        Assert.assertEquals("Photo shared on Facebook", zuzPost);
    }

}
