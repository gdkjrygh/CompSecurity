// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishRating;
import com.contextlogic.wish.api.data.WishUser;

public class ProductDetailsTopRatingRow extends LinearLayout
{

    private TextView authorText;
    private TextView commentText;
    private WishRating rating;
    private ImageView ratingStarFive;
    private ImageView ratingStarFour;
    private ImageView ratingStarOne;
    private ImageView ratingStarThree;
    private ImageView ratingStarTwo;

    public ProductDetailsTopRatingRow(Context context)
    {
        this(context, null);
    }

    public ProductDetailsTopRatingRow(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030080, this);
        setOrientation(1);
        commentText = (TextView)view.findViewById(0x7f0d0264);
        authorText = (TextView)view.findViewById(0x7f0d0265);
        ratingStarOne = (ImageView)view.findViewById(0x7f0d025f);
        ratingStarTwo = (ImageView)view.findViewById(0x7f0d0260);
        ratingStarThree = (ImageView)view.findViewById(0x7f0d0261);
        ratingStarFour = (ImageView)view.findViewById(0x7f0d0262);
        ratingStarFive = (ImageView)view.findViewById(0x7f0d0263);
    }

    public void setRating(WishRating wishrating)
    {
        rating = wishrating;
        authorText.setText(wishrating.getAuthor().getName());
        commentText.setText((new StringBuilder()).append("\"").append(wishrating.getComment()).append("\"").toString());
        int ai[] = new int[5];
        int i = 0;
        while (i < 5) 
        {
            if (wishrating.getRating() >= i + 1)
            {
                ai[i] = 0x7f0201ce;
            } else
            {
                ai[i] = 0x7f0200d8;
            }
            i++;
        }
        ratingStarOne.setImageResource(ai[0]);
        ratingStarTwo.setImageResource(ai[1]);
        ratingStarThree.setImageResource(ai[2]);
        ratingStarFour.setImageResource(ai[3]);
        ratingStarFive.setImageResource(ai[4]);
    }

    public void setTextSize(int i)
    {
        commentText.setTextSize(1, i);
    }
}
