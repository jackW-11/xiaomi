package cpm.yfz.xiaomiTest.newdao;

import cpm.yfz.xiaomiTest.newdaomain.Tag;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        getMatch();
    }

    private static void getMatch() {
        Tag clip01 = new Tag("1",10005,1.455,3.5454);
        Tag clip02 = new Tag("2",10002,1.455,3.5454);
        Tag clip03 = new Tag("3",10004,1.455,3.5454);
        Tag clip04 = new Tag("4",10005,1.455,3.5454);
        Tag clip05 = new Tag("5",10007,1.455,3.5454);
        Tag clip06 = new Tag("6",10008,1.455,3.5454);
        Tag clip07 = new Tag("7",10009,1.455,3.5454);
        Tag clip08 = new Tag("8",10004,1.455,3.5454);
        Tag clip09 = new Tag("9",100035,1.455,3.5454);
        Tag clip10 = new Tag("10",10067,1.455,3.5454);
        Tag clip11 = new Tag("11",10005,1.455,3.5454);
        Tag clip12 = new Tag("12",10006,1.455,3.5454);
        Tag clip13 = new Tag("13",10005,1.455,3.5454);
        Tag clip14 = new Tag("14",10005,1.455,3.5454);
        Tag clip15 = new Tag("15",10005,1.455,3.5454);
        Tag clip16 = new Tag("16",10000,1.455,3.5454);
        Tag clip17 = new Tag("17",10005,1.455,3.5454);
        Tag clip18 = new Tag("18",10005,1.455,3.5454);
        Tag clip19 = new Tag("19",10007,1.455,3.5454);
        Tag clip20 = new Tag("20",10005,1.455,3.5454);
        Tag clip21 = new Tag("21",10004,1.455,3.5454);
        ArrayList<Tag> tags= new ArrayList<Tag>();
        tags.add(clip01);
        tags.add(clip02);
        tags.add(clip03);
        tags.add(clip04);
        tags.add(clip05);
        tags.add(clip06);
        tags.add(clip07);
        tags.add(clip08);
        tags.add(clip09);
        tags.add(clip10);
        tags.add(clip11);
        tags.add(clip12);
        tags.add(clip13);
        tags.add(clip14);
        tags.add(clip15);
        tags.add(clip16);
        tags.add(clip17);
        tags.add(clip18);
        tags.add(clip19);
        tags.add(clip20);
        tags.add(clip21);
        //定义一个视频，17部分
        Tag[] videos = new Tag[17];
        //定义一个分数数组
        int[] scores = new int[tags.size()];
        //遍历每一个视频
        for (int x = 0 ; x < videos.length ; x++){
            //遍历每一个标签
            for (int y = 0 ; y < tags.size() ; ) {
                //判断是否被使用
                if (!tags.get(y).isUsed()){
                    //打分
                    if (tags.get(y).getId() == 10005) {
                        scores[y] = 10;
                    } else if (tags.get(y).getId() == 10004) {
                        scores[y] = 10;
                    } else if (tags.get(y).getId() == 10007) {
                        scores[y] = 9;
                    } else if (tags.get(y).getId() == 10002) {
                        scores[y] = 8;
                    }else{
                        scores[y] = 0;
                    }
                    y++;
                }else{
                    scores[y] = -1;
                    y++;
                }
            }
            for (int score : scores) {
                System.out.print(score);
            }
            System.out.println();
            //判断最高分
            int max = -1;
            int maxIndex = 0;
            for (int y = 0 ; y < scores.length ; ){
                if (max<scores[y]){
                    max = scores[y];
                    maxIndex = y;
                    y++;
                }else{
                    y++;
                }
            }
            //得到了最高分和对应的角标值
            tags.get(maxIndex).setUsed(true);
            //获取对象，并值为出
            videos[x] = new Tag(tags.get(maxIndex).getName(),
                    tags.get(maxIndex).getId(),
                    tags.get(maxIndex).getStart_time(),
                    tags.get(maxIndex).getEnd_time(),
                    max);
        }
        int sumScore = 0;
        for (Tag video : videos) {
            sumScore+=video.getScore();
        }
        System.out.println(sumScore);
        for (Tag video : videos) {
            System.out.println(video.toString());
        }
    }
}
