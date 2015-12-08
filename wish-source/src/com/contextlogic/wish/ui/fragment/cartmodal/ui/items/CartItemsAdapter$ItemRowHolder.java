// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.timer.CountdownTimerView;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.items:
//            CartItemsAdapter

static class Y
{

    LinearLayout colorContainer;
    TextView colorText;
    LinearLayout countdownContainer;
    CountdownTimerView countdownTimer;
    TextView editButton;
    BorderedImageView imageView;
    LinearLayout productRatingContainer;
    ImageView productRatingStarFive;
    ImageView productRatingStarFour;
    ImageView productRatingStarOne;
    ImageView productRatingStarThree;
    ImageView productRatingStarTwo;
    TextView productRatingText;
    LinearLayout quantityContainer;
    TextView quantityText;
    TextView removeButton;
    TextView rowOriginalPrice;
    TextView rowPrice;
    TextView rowTitle;
    LinearLayout shippingContainer;
    TextView shippingText;
    LinearLayout sizeContainer;
    TextView sizeText;
    TextView urgencyText;
    LinearLayout warningMessageContainer;

    public void hideProductRating()
    {
        productRatingContainer.setVisibility(8);
        productRatingStarOne.setVisibility(8);
        productRatingStarTwo.setVisibility(8);
        productRatingStarThree.setVisibility(8);
        productRatingStarFour.setVisibility(8);
        productRatingStarFive.setVisibility(8);
        productRatingText.setVisibility(8);
    }

    public void showProductRating()
    {
        productRatingContainer.setVisibility(0);
        productRatingStarOne.setVisibility(0);
        productRatingStarTwo.setVisibility(0);
        productRatingStarThree.setVisibility(0);
        productRatingStarFour.setVisibility(0);
        productRatingStarFive.setVisibility(0);
        productRatingText.setVisibility(0);
    }

    Y()
    {
    }
}
