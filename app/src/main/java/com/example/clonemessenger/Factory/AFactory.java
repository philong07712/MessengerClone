package com.example.clonemessenger.Factory;

import com.example.clonemessenger.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class AFactory implements IFactory {
    Random generate = new Random();
    List<Integer> listAvatarImgs = new ArrayList<>(
            Arrays.asList(R.drawable.mya,
                    R.drawable.ethan,
                    R.drawable.steve,
                    R.drawable.han,
                    R.drawable.elena,
                    R.drawable.rose,
                    R.drawable.josh,
                    R.drawable.christ)
    );

    List<String> listName = new ArrayList<>(
            Arrays.asList("Mya Kaspersky",
                    "Ethan Cutkosky",
                    "Steve Jobs",
                    "Han Seung Woo",
                    "Elena Deligioz",
                    "Rose Imanbek",
                    "Josh Brolin",
                    "Christ Evanas")
    );

    List<Integer> listNewsImgs = new ArrayList<>(
            Arrays.asList(R.drawable.mermaid,
                    R.drawable.ninja,
                    R.drawable.spring,
                    R.drawable.rainbow,
                    R.drawable.water,
                    R.drawable.wink,
                    R.drawable.umbrella,
                    R.drawable.paint2,
                    R.drawable.paint,
                    R.drawable.illustrationtwo,
                    R.drawable.illustration,
                    R.drawable.houses,
                    R.drawable.cat,
                    R.drawable.bee,
                    R.drawable.blossom,
                    R.drawable.butterfly)
    );

}
