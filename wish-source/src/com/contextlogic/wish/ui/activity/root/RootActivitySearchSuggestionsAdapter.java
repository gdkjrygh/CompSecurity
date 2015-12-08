// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishFeedEndedButtonSpec;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishTopSearchSpec;
import com.contextlogic.wish.api.service.ProductSearchService;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class RootActivitySearchSuggestionsAdapter extends CursorAdapter
    implements Filterable
{
    static class SearchItemRowHolder
    {

        TextView rowCenterText;
        ImageView rowIcon;
        BorderedImageView rowImage;
        TextView rowText;

        SearchItemRowHolder()
        {
        }
    }


    private static final String COLUMNS[] = {
        "_id", "suggest_text_1", "suggest_text_2", "suggest_text_2_url", "suggest_intent_extra_data", "suggest_intent_action"
    };
    private Context context;
    private Cursor historyCursor;
    private ProductSearchService productSearchService;

    public RootActivitySearchSuggestionsAdapter(Context context1, Cursor cursor)
    {
        super(context1, cursor, false);
        context = context1;
        historyCursor = cursor;
        productSearchService = new ProductSearchService();
    }

    private static Object[] createHistoryRow(Integer integer, String s)
    {
        return (new Object[] {
            integer, s, null, null, null, "history"
        });
    }

    private Object[] createMoreResultsRow(Integer integer)
    {
        return (new Object[] {
            integer, context.getString(0x7f0603a3), null, null, null, "moreproduct"
        });
    }

    private Object[] createProductRow(Integer integer, WishProduct wishproduct)
    {
        return (new Object[] {
            integer, wishproduct.getName(), null, wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium), wishproduct.getProductId(), "product"
        });
    }

    private void fetchProductResults(String s, final CountDownLatch doneSignal, final ArrayList resultList)
    {
        productSearchService.requestService(s, 0, 10, false, new com.contextlogic.wish.api.service.ProductSearchService.SuccessCallback() {

            final RootActivitySearchSuggestionsAdapter this$0;
            final CountDownLatch val$doneSignal;
            final ArrayList val$resultList;

            public void onServiceSucceeded(ArrayList arraylist, int i, int j, WishFeedEndedButtonSpec wishfeedendedbuttonspec, String s1)
            {
                arraylist = arraylist.iterator();
                do
                {
                    if (!arraylist.hasNext())
                    {
                        break;
                    }
                    wishfeedendedbuttonspec = ((WishFeedEndedButtonSpec) (arraylist.next()));
                    if (wishfeedendedbuttonspec instanceof WishProduct)
                    {
                        resultList.add((WishProduct)wishfeedendedbuttonspec);
                    }
                } while (true);
                resultList.add(Integer.valueOf(i));
                doneSignal.countDown();
            }

            
            {
                this$0 = RootActivitySearchSuggestionsAdapter.this;
                resultList = arraylist;
                doneSignal = countdownlatch;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final RootActivitySearchSuggestionsAdapter this$0;
            final CountDownLatch val$doneSignal;

            public void onServiceFailed()
            {
                doneSignal.countDown();
            }

            
            {
                this$0 = RootActivitySearchSuggestionsAdapter.this;
                doneSignal = countdownlatch;
                super();
            }
        });
    }

    public static Cursor getHistoryCursor()
    {
        MatrixCursor matrixcursor = new MatrixCursor(COLUMNS);
        HashSet hashset = new HashSet();
        ArrayList arraylist = new ArrayList();
        Object obj = UserStatusManager.getInstance().getTopSearchSpecs();
        arraylist.addAll(UserPreferences.getSearchHistory());
        for (Iterator iterator1 = arraylist.iterator(); iterator1.hasNext(); hashset.add(((String)iterator1.next()).toUpperCase())) { }
        obj = ((ArrayList) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            WishTopSearchSpec wishtopsearchspec = (WishTopSearchSpec)((Iterator) (obj)).next();
            if (!hashset.contains(wishtopsearchspec.getQuery().toUpperCase()))
            {
                arraylist.add(wishtopsearchspec.getQuery());
            }
        } while (true);
        int i = 0;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext();)
        {
            matrixcursor.addRow(createHistoryRow(Integer.valueOf(i), (String)iterator.next()));
            i++;
        }

        return matrixcursor;
    }

    public void bindView(View view, Context context1, Cursor cursor)
    {
        view = (SearchItemRowHolder)view.getTag();
        ((SearchItemRowHolder) (view)).rowImage.getImageView().setImageUrl(null);
        context1 = cursor.getString(cursor.getColumnIndex("suggest_intent_action"));
        String s = cursor.getString(cursor.getColumnIndex("suggest_text_1"));
        cursor = cursor.getString(cursor.getColumnIndex("suggest_text_2_url"));
        if (context1.equals("history"))
        {
            ((SearchItemRowHolder) (view)).rowImage.setVisibility(8);
            ((SearchItemRowHolder) (view)).rowIcon.setVisibility(0);
            ((SearchItemRowHolder) (view)).rowCenterText.setVisibility(8);
            ((SearchItemRowHolder) (view)).rowText.setVisibility(0);
            ((SearchItemRowHolder) (view)).rowText.setText(s);
            return;
        }
        if (context1.equals("moreproduct"))
        {
            ((SearchItemRowHolder) (view)).rowCenterText.setVisibility(0);
            ((SearchItemRowHolder) (view)).rowText.setVisibility(8);
            ((SearchItemRowHolder) (view)).rowImage.setVisibility(8);
            ((SearchItemRowHolder) (view)).rowIcon.setVisibility(8);
            ((SearchItemRowHolder) (view)).rowCenterText.setText(s);
            return;
        } else
        {
            ((SearchItemRowHolder) (view)).rowCenterText.setVisibility(8);
            ((SearchItemRowHolder) (view)).rowText.setVisibility(0);
            ((SearchItemRowHolder) (view)).rowIcon.setVisibility(8);
            ((SearchItemRowHolder) (view)).rowImage.setVisibility(0);
            ((SearchItemRowHolder) (view)).rowText.setText(s);
            ((SearchItemRowHolder) (view)).rowImage.getImageView().setImageUrl(cursor);
            return;
        }
    }

    public volatile CharSequence convertToString(Cursor cursor)
    {
        return convertToString(cursor);
    }

    public String convertToString(Cursor cursor)
    {
        return cursor.getString(cursor.getColumnIndex("suggest_text_1"));
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View newView(Context context1, Cursor cursor, ViewGroup viewgroup)
    {
        context1 = ((Activity)context).getLayoutInflater().inflate(0x7f03001a, viewgroup, false);
        cursor = new SearchItemRowHolder();
        cursor.rowIcon = (ImageView)context1.findViewById(0x7f0d0087);
        cursor.rowImage = (BorderedImageView)context1.findViewById(0x7f0d0088);
        cursor.rowText = (TextView)context1.findViewById(0x7f0d0089);
        cursor.rowCenterText = (TextView)context1.findViewById(0x7f0d008a);
        ((SearchItemRowHolder) (cursor)).rowImage.getImageView().setRequestedImageHeight(50);
        ((SearchItemRowHolder) (cursor)).rowImage.getImageView().setRequestedImageWidth(50);
        context1.setTag(cursor);
        return context1;
    }

    public Cursor runQueryOnBackgroundThread(CharSequence charsequence)
    {
        if (charsequence != null && !charsequence.toString().trim().equals(""))
        {
            MatrixCursor matrixcursor = new MatrixCursor(COLUMNS);
            Object obj = charsequence.toString().trim();
            CountDownLatch countdownlatch = new CountDownLatch(1);
            charsequence = new ArrayList();
            fetchProductResults(((String) (obj)), countdownlatch, charsequence);
            int i;
            try
            {
                countdownlatch.await();
            }
            catch (InterruptedException interruptedexception) { }
            i = 0;
            obj = charsequence.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Object obj1 = ((Iterator) (obj)).next();
                if (obj1 instanceof WishProduct)
                {
                    matrixcursor.addRow(createProductRow(Integer.valueOf(i), (WishProduct)obj1));
                } else
                if ((obj1 instanceof Integer) && ((Integer)obj1).intValue() > charsequence.size() - 1)
                {
                    matrixcursor.addRow(createMoreResultsRow(Integer.valueOf(i)));
                }
                i++;
            }
            return matrixcursor;
        } else
        {
            return historyCursor;
        }
    }

}
