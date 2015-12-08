// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop;

import com.walmart.android.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmart.android.app.shop:
//            BrowseTokenParser

public class ShopFilterManager
{
    public static interface OnFilterChangedListener
    {

        public abstract void onFilterChanged();
    }


    private String mBrowseToken;
    private String mDepartment;
    private ArrayList mListeners;
    private ArrayList mRefinements;
    private String mSearchQuery;
    private String mShelfDepartmentTitle;
    private String mStoreID;

    public ShopFilterManager()
    {
        mRefinements = new ArrayList();
        mListeners = new ArrayList();
    }

    private void notifyListeners()
    {
        for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((OnFilterChangedListener)iterator.next()).onFilterChanged()) { }
    }

    private String removeColonsAtEndOfToken(String s)
    {
        String s1 = s;
        if (s != null)
        {
            do
            {
                s1 = s;
                if (!s.endsWith(":"))
                {
                    break;
                }
                s = s.substring(0, s.length() - 1);
            } while (true);
        }
        return s1;
    }

    public void addOnFilterChangedListener(OnFilterChangedListener onfilterchangedlistener)
    {
        mListeners.add(onfilterchangedlistener);
    }

    public void clearRefinements()
    {
        mRefinements.clear();
    }

    public String[] generateSingleRefinementToken(int i, int j)
    {
        return BrowseTokenParser.generateSingleRefinementToken(this, i, j);
    }

    public String getBrowseToken()
    {
        return mBrowseToken;
    }

    public String getDepartment()
    {
        return mDepartment;
    }

    public String[] getRefinementBrowseTokens()
    {
        String as[] = new String[0];
        if (mRefinements != null)
        {
            String as1[] = new String[mRefinements.size()];
            int i = 0;
            do
            {
                as = as1;
                if (i >= mRefinements.size())
                {
                    break;
                }
                as1[i] = removeColonsAtEndOfToken(((com.walmart.android.data.StoreQueryResult.Refinement)mRefinements.get(i)).getBrowseToken());
                i++;
            } while (true);
        }
        return as;
    }

    public String[] getRefinementIds()
    {
        String as[] = new String[0];
        if (mRefinements != null)
        {
            String as1[] = new String[mRefinements.size()];
            int i = 0;
            do
            {
                as = as1;
                if (i >= mRefinements.size())
                {
                    break;
                }
                as1[i] = ((com.walmart.android.data.StoreQueryResult.Refinement)mRefinements.get(i)).getId();
                i++;
            } while (true);
        }
        return as;
    }

    public ArrayList getRefinements()
    {
        return new ArrayList(mRefinements);
    }

    public ArrayList getRefinementsInGroup(final String group)
    {
        ArrayList arraylist = new ArrayList();
        CollectionUtils.collectIf(mRefinements, arraylist, new com.walmart.android.utils.CollectionUtils.UnaryPredicate() {

            final ShopFilterManager this$0;
            final String val$group;

            public boolean isTrue(com.walmart.android.data.StoreQueryResult.Refinement refinement)
            {
                return group.equals(refinement.getParent());
            }

            public volatile boolean isTrue(Object obj)
            {
                return isTrue((com.walmart.android.data.StoreQueryResult.Refinement)obj);
            }

            
            {
                this$0 = ShopFilterManager.this;
                group = s;
                super();
            }
        });
        return arraylist;
    }

    public String getSearchQuery()
    {
        return mSearchQuery;
    }

    public String getShelfDepartmentTitle()
    {
        return mShelfDepartmentTitle;
    }

    public String getStoreID()
    {
        return mStoreID;
    }

    public void removeOnFilterChangedListener(OnFilterChangedListener onfilterchangedlistener)
    {
        mListeners.remove(onfilterchangedlistener);
    }

    public void reset()
    {
        setStoreID(null);
        setBrowseToken(null);
        setDepartment(null);
        setSearchQuery(null);
        setShelfDepartmentTitle(null);
        clearRefinements();
    }

    public void setBrowseToken(String s)
    {
        mBrowseToken = s;
    }

    public void setDepartment(String s)
    {
        mDepartment = s;
    }

    public void setRefinements(ArrayList arraylist)
    {
        mRefinements = arraylist;
        notifyListeners();
    }

    public void setSearchQuery(String s)
    {
        mSearchQuery = s;
    }

    public void setShelfDepartmentTitle(String s)
    {
        mShelfDepartmentTitle = s;
    }

    public void setStoreID(String s)
    {
        mStoreID = s;
    }

    public void updateRefinementsInGroup(String s, List list)
    {
label0:
        {
            s = getRefinementsInGroup(s);
            Iterator iterator;
            boolean flag;
            boolean flag1;
            if (s.size() != list.size())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (flag)
            {
                break label0;
            }
            iterator = s.iterator();
            do
            {
                flag1 = flag;
                if (!iterator.hasNext())
                {
                    break label0;
                }
            } while (list.contains((com.walmart.android.data.StoreQueryResult.Refinement)iterator.next()));
            flag1 = true;
        }
        if (flag1)
        {
            mRefinements.removeAll(s);
            mRefinements.addAll(list);
            notifyListeners();
        }
    }
}
