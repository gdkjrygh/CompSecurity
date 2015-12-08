// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import com.walmartlabs.ui.recycler.PagingAdapter;

// Referenced classes of package com.walmart.android.app.shop.map:
//            SourceDataMapper, AislePositions, MappedSections

public class SearchResultSourceDataMapper extends SourceDataMapper
{

    private final android.support.v7.widget.RecyclerView.AdapterDataObserver dataObserver = new android.support.v7.widget.RecyclerView.AdapterDataObserver() {

        final SearchResultSourceDataMapper this$0;

        public void onChanged()
        {
            update();
        }

        public void onItemRangeChanged(int i, int j)
        {
            update();
        }

        public void onItemRangeInserted(int i, int j)
        {
            update();
        }

        public void onItemRangeMoved(int i, int j, int k)
        {
            update();
        }

        public void onItemRangeRemoved(int i, int j)
        {
            update();
        }

            
            {
                this$0 = SearchResultSourceDataMapper.this;
                super();
            }
    };

    public SearchResultSourceDataMapper()
    {
    }

    public boolean setStoreDataSource(String s, PagingAdapter pagingadapter)
    {
        if (getDataSource() != null)
        {
            ((PagingAdapter)getDataSource()).unregisterAdapterDataObserver(dataObserver);
        }
        boolean flag = super.setStoreDataSource(s, pagingadapter);
        if (getDataSource() != null)
        {
            ((PagingAdapter)getDataSource()).registerAdapterDataObserver(dataObserver);
        }
        return flag;
    }

    public volatile boolean setStoreDataSource(String s, Object obj)
    {
        return setStoreDataSource(s, (PagingAdapter)obj);
    }

    protected MappedSections updateDetailedLocations(AislePositions aislepositions, PagingAdapter pagingadapter)
    {
        MappedSections.Builder builder = new MappedSections.Builder();
        if (pagingadapter != null && aislepositions != null)
        {
label0:
            for (int i = 0; i < pagingadapter.getDataItemCount(); i++)
            {
                boolean flag1 = false;
                com.walmart.android.data.InStoreSearchResult.Result result = (com.walmart.android.data.InStoreSearchResult.Result)pagingadapter.getItem(i);
                if (result == null || result.location == null || result.location.detailed == null)
                {
                    continue;
                }
                com.walmart.android.data.InStoreSearchResult.Detailed adetailed[] = result.location.detailed;
                int k = adetailed.length;
                int j = 0;
                do
                {
                    if (j >= k)
                    {
                        continue label0;
                    }
                    Object obj1 = adetailed[j];
                    float af[] = aislepositions.getAislePosition(getAisleSection(((com.walmart.android.data.InStoreSearchResult.Detailed) (obj1))));
                    boolean flag = flag1;
                    if (af != null)
                    {
                        flag = flag1;
                        if (!flag1)
                        {
                            flag1 = true;
                            Object obj = new AisleSection.Builder();
                            ((AisleSection.Builder) (obj)).setDepartment(result.getDepartmentName()).setName(getAisle(((com.walmart.android.data.InStoreSearchResult.Detailed) (obj1)))).setPosition(af);
                            obj1 = new MappedData.Builder();
                            ((MappedData.Builder) (obj1)).setSourcePosition(i).setAisleSection(((AisleSection.Builder) (obj)).build()).setSourceData(result);
                            obj = ((MappedData.Builder) (obj1)).build();
                            flag = flag1;
                            if (obj != null)
                            {
                                builder.addMappedData(((MappedData) (obj)));
                                flag = flag1;
                            }
                        }
                    }
                    j++;
                    flag1 = flag;
                } while (true);
            }

        }
        return builder.build();
    }

    protected volatile MappedSections updateDetailedLocations(AislePositions aislepositions, Object obj)
    {
        return updateDetailedLocations(aislepositions, (PagingAdapter)obj);
    }
}
