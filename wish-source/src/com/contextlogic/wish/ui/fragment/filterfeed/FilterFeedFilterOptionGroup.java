// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishFilter;
import com.contextlogic.wish.api.data.WishFilterGroup;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.components.layout.FlowLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.contextlogic.wish.ui.fragment.filterfeed:
//            FilterFeedFilterOption, FilterFeedFilterOptionPage

public class FilterFeedFilterOptionGroup extends LinearLayout
{

    private FlowLayout filterContainer;
    private WishFilterGroup filterGroup;
    private BorderedImageView icon;
    private FilterFeedFilterOptionPage optionPage;
    private TextView title;

    public FilterFeedFilterOptionGroup(Context context)
    {
        this(context, null);
    }

    public FilterFeedFilterOptionGroup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void clearAllSelected()
    {
        for (int i = 0; i < filterContainer.getChildCount(); i++)
        {
            FilterFeedFilterOption filterfeedfilteroption = (FilterFeedFilterOption)filterContainer.getChildAt(i);
            filterfeedfilteroption.setSelected(false);
            optionPage.deselectFilter(filterfeedfilteroption.getFilter());
        }

    }

    private void deselectFilter(FilterFeedFilterOption filterfeedfilteroption)
    {
        filterfeedfilteroption.setSelected(false);
        optionPage.deselectFilter(filterfeedfilteroption.getFilter());
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030054, this);
        title = (TextView)view.findViewById(0x7f0d01d7);
        icon = (BorderedImageView)view.findViewById(0x7f0d01d6);
        filterContainer = (FlowLayout)view.findViewById(0x7f0d01d9);
        icon.setUseLoadingSpinner(com.contextlogic.wish.ui.components.image.BorderedImageView.LoadingStyle.Gone);
        icon.getImageView().setRequestedImageHeight(24);
        icon.getImageView().setRequestedImageWidth(24);
        view.findViewById(0x7f0d01d8).setOnClickListener(new android.view.View.OnClickListener() {

            final FilterFeedFilterOptionGroup this$0;

            public void onClick(View view1)
            {
                clearAllSelected();
            }

            
            {
                this$0 = FilterFeedFilterOptionGroup.this;
                super();
            }
        });
        setOrientation(1);
    }

    private void selectFilter(FilterFeedFilterOption filterfeedfilteroption)
    {
        if (filterGroup.isExclusive())
        {
            clearAllSelected();
        }
        filterfeedfilteroption.setSelected(true);
        optionPage.selectFilter(filterfeedfilteroption.getFilter());
    }

    private void toggleFilter(FilterFeedFilterOption filterfeedfilteroption)
    {
        if (filterfeedfilteroption.isSelected())
        {
            deselectFilter(filterfeedfilteroption);
            return;
        } else
        {
            selectFilter(filterfeedfilteroption);
            return;
        }
    }

    public void resync(Set set)
    {
        for (int i = 0; i < filterContainer.getChildCount(); i++)
        {
            FilterFeedFilterOption filterfeedfilteroption = (FilterFeedFilterOption)filterContainer.getChildAt(i);
            filterfeedfilteroption.setSelected(set.contains(filterfeedfilteroption.getFilter().getFilterId()));
        }

    }

    public void setup(FilterFeedFilterOptionPage filterfeedfilteroptionpage, WishFilterGroup wishfiltergroup)
    {
        filterGroup = wishfiltergroup;
        optionPage = filterfeedfilteroptionpage;
        title.setText(wishfiltergroup.getName());
        icon.getImageView().setImageUrl(wishfiltergroup.getIconUrl());
        filterContainer.removeAllViews();
        FilterFeedFilterOption filterfeedfilteroption;
        for (filterfeedfilteroptionpage = wishfiltergroup.getFilters().iterator(); filterfeedfilteroptionpage.hasNext(); filterContainer.addView(filterfeedfilteroption))
        {
            wishfiltergroup = (WishFilter)filterfeedfilteroptionpage.next();
            filterfeedfilteroption = new FilterFeedFilterOption(getContext());
            filterfeedfilteroption.setFilter(wishfiltergroup);
            filterfeedfilteroption.setOnClickListener(new android.view.View.OnClickListener() {

                final FilterFeedFilterOptionGroup this$0;

                public void onClick(View view)
                {
                    toggleFilter((FilterFeedFilterOption)view);
                }

            
            {
                this$0 = FilterFeedFilterOptionGroup.this;
                super();
            }
            });
        }

    }


}
