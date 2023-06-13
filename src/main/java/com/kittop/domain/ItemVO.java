package com.kittop.domain;

import lombok.*;

import java.util.Date;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ItemVO {

   private long itemId;
   private String category;
   private String itemName;
   private int price;
   private String content;
   private int stock;
   private int hit;
   private String imgName;
   private Date regDate;
   private Date updateDate;


}
