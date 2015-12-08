// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.wallet;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishBrandFilter;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishWalletItem;
import com.contextlogic.wish.api.service.GetWalletItemsService;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.list.LoadingListRow;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.menu.MainMenuItem;
import com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.wallet:
//            WalletAdapter

public class WalletFragment extends BaseContentFragment
{
    public static final class SectionMode extends Enum
    {

        private static final SectionMode $VALUES[];
        public static final SectionMode GiftCards;
        public static final SectionMode Rebates;

        public static SectionMode valueOf(String s)
        {
            return (SectionMode)Enum.valueOf(com/contextlogic/wish/ui/fragment/wallet/WalletFragment$SectionMode, s);
        }

        public static SectionMode[] values()
        {
            return (SectionMode[])$VALUES.clone();
        }

        static 
        {
            GiftCards = new SectionMode("GiftCards", 0);
            Rebates = new SectionMode("Rebates", 1);
            $VALUES = (new SectionMode[] {
                GiftCards, Rebates
            });
        }

        private SectionMode(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int REQUEST_ITEM_COUNT = 20;
    private static final com.contextlogic.wish.api.data.WishWalletItem.WalletItemType SECTION_TYPES[];
    private static final String STORED_STATE_CURRENT_OFFSET = "StoredStateCurrentOffset";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private static final String STORED_STATE_NO_MORE_DATA = "StoredStateNoMoreData";
    private int currentOffset;
    private String dataStateStoreKey;
    private View errorView;
    private GetWalletItemsService getWalletItemsService;
    private WalletAdapter listAdapter;
    private ListView listView;
    private boolean loadingComplete;
    private boolean loadingErrored;
    private LoadingListRow loadingListRow;
    private View loadingView;
    private TextView noItemsText;
    private View noItemsView;
    private boolean noMoreItems[];
    private boolean updatingList;
    private ArrayList walletItems;

    public WalletFragment()
    {
    }

    private boolean didLoadAllSections()
    {
        boolean aflag[] = noMoreItems;
        int j = aflag.length;
        for (int i = 0; i < j; i++)
        {
            if (!aflag[i])
            {
                return false;
            }
        }

        return true;
    }

    private void handleItemClick(int i)
    {
        if (getActivity() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        obj = (WishWalletItem)walletItems.get(i);
        trackClick(WishAnalyticsEvent.CLICK_MOBILE_WALLET_ITEM);
        if (((WishWalletItem) (obj)).getActionDeepLink() == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = Uri.parse(((WishWalletItem) (obj)).getActionDeepLink());
        if (obj == null) goto _L1; else goto _L3
_L3:
        obj = WishDeepLinkActivity.getDeepLinkTarget(((Uri) (obj)));
        if (obj == null) goto _L1; else goto _L4
_L4:
        FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity == null || !(fragmentactivity instanceof RootActivity)) goto _L1; else goto _L5
_L5:
        ((RootActivity)fragmentactivity).processDeepLink(((com.contextlogic.wish.ApplicationDeepLinkConfig) (obj)), false);
        return;
        if (((WishWalletItem) (obj)).getType() != com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.GiftCard && ((WishWalletItem) (obj)).getType() != com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.ExpiredGiftCard) goto _L1; else goto _L6
_L6:
        obj = new WishBrandFilter("wishwall", String.format(getString(0x7f060127), new Object[] {
            ((WishWalletItem) (obj)).getDiscountValue().toFormattedString()
        }), null, null, null, ((WishWalletItem) (obj)).getCreditId(), true, false);
        ProductFeedFragment productfeedfragment = new ProductFeedFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("ArgDataValue", ((java.io.Serializable) (obj)));
        bundle.putInt("ArgDataMode", com.contextlogic.wish.ui.fragment.productfeed.ProductFeedFragment.DataMode.Brand.ordinal());
        productfeedfragment.setArguments(bundle);
        ((RootActivity)getActivity()).setContentFragment(productfeedfragment, false);
        return;
    }

    private void handleLoadingFailure()
    {
        loadingErrored = true;
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0601db));
        refreshViewState();
    }

    private void handleLoadingSuccess(ArrayList arraylist, boolean flag)
    {
        int i;
        loadingComplete = true;
        WishWalletItem wishwalletitem;
        for (arraylist = arraylist.iterator(); arraylist.hasNext(); walletItems.add(wishwalletitem))
        {
            wishwalletitem = (WishWalletItem)arraylist.next();
        }

        if (!flag)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        i = 0;
_L5:
        if (i >= noMoreItems.length) goto _L2; else goto _L1
_L1:
        if (noMoreItems[i]) goto _L4; else goto _L3
_L3:
        noMoreItems[i] = true;
_L2:
        currentOffset = 0;
_L6:
        if (!didLoadAllSections() && walletItems.size() < 10)
        {
            loadNextPage();
        }
        int j = listView.getFirstVisiblePosition();
        arraylist = listView.getChildAt(0);
        if (arraylist == null)
        {
            i = 0;
        } else
        {
            i = arraylist.getTop();
        }
        listAdapter.notifyDataSetChanged();
        listView.setSelectionFromTop(j, i);
        refreshViewState();
        updatingList = false;
        return;
_L4:
        i++;
          goto _L5
        currentOffset = currentOffset + 20;
          goto _L6
    }

    private void handleScrollLoad(int i, int j, int k)
    {
        boolean flag;
        if (!loadingErrored && !didLoadAllSections() && !getWalletItemsService.isPending() && !updatingList && loadingComplete)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && i > k - j * 2)
        {
            loadNextPage();
        }
    }

    private void hideAllUiElements()
    {
        listView.setVisibility(8);
        errorView.setVisibility(8);
        noItemsView.setVisibility(8);
        loadingView.setVisibility(8);
    }

    private void loadNextPage()
    {
        if (didLoadAllSections())
        {
            return;
        }
        loadingErrored = false;
        Object obj = null;
        int i = 0;
        do
        {
label0:
            {
                com.contextlogic.wish.api.data.WishWalletItem.WalletItemType walletitemtype = obj;
                if (i < SECTION_TYPES.length)
                {
                    if (noMoreItems[i])
                    {
                        break label0;
                    }
                    walletitemtype = SECTION_TYPES[i];
                }
                getWalletItemsService.requestService(walletitemtype, currentOffset, 20, new com.contextlogic.wish.api.service.GetWalletItemsService.SuccessCallback() {

                    final WalletFragment this$0;

                    public void onServiceSucceeded(final ArrayList items, boolean flag)
                    {
                        updatingList = true;
                        postDelayed(flag. new Runnable() {

                            final _cls5 this$1;
                            final ArrayList val$items;
                            final boolean val$noMoreItems;

                            public void run()
                            {
                                handleLoadingSuccess(items, noMoreItems);
                            }

            
            {
                this$1 = final__pcls5;
                items = arraylist;
                noMoreItems = Z.this;
                super();
            }
                        }, getAnimationTimeRemaining());
                    }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
                }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                    final WalletFragment this$0;

                    public void onServiceFailed()
                    {
                        postDelayed(new Runnable() {

                            final _cls6 this$1;

                            public void run()
                            {
                                handleLoadingFailure();
                            }

            
            {
                this$1 = _cls6.this;
                super();
            }
                        }, getAnimationTimeRemaining());
                    }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
                });
                refreshViewState();
                return;
            }
            i++;
        } while (true);
    }

    private void refreshViewState()
    {
        hideAllUiElements();
        if (!loadingErrored) goto _L2; else goto _L1
_L1:
        if (walletItems.size() <= 0) goto _L4; else goto _L3
_L3:
        listView.setVisibility(0);
        if (!didLoadAllSections()) goto _L6; else goto _L5
_L5:
        loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
_L8:
        return;
_L6:
        if (getWalletItemsService.isPending())
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
            return;
        } else
        {
            loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
            return;
        }
_L4:
        errorView.setVisibility(0);
        return;
_L2:
        if (loadingComplete && didLoadAllSections() && walletItems.size() == 0)
        {
            noItemsView.setVisibility(0);
            return;
        }
        if (loadingComplete && walletItems.size() > 0)
        {
            listView.setVisibility(0);
            if (didLoadAllSections())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.NoMoreItems);
                return;
            }
            if (getWalletItemsService.isPending())
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.Loading);
                return;
            } else
            {
                loadingListRow.setLoadingMode(com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode.ClickToLoad);
                return;
            }
        }
        if (getWalletItemsService.isPending())
        {
            getNavigationBar().clearRightButtons();
            loadingView.setVisibility(0);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.Wallet;
    }

    public int getLayoutResourceId()
    {
        return 0x7f0300b9;
    }

    public MainMenuItem getTopLevelMenuItem()
    {
        return MainMenuItem.WALLET;
    }

    public void handleResume()
    {
        super.handleResume();
        if (currentOffset == -1 || !loadingComplete)
        {
            currentOffset = 0;
            loadNextPage();
        }
        refreshViewState();
        if (listAdapter != null)
        {
            listAdapter.resumeCacheWarming();
        }
    }

    public void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060475));
        listView = (ListView)view.findViewById(0x7f0d03ec);
        loadingView = view.findViewById(0x7f0d03ed);
        noItemsView = view.findViewById(0x7f0d03ee);
        errorView = view.findViewById(0x7f0d03f0);
        noItemsText = (TextView)view.findViewById(0x7f0d03ef);
        noItemsText.setText(getString(0x7f0601dc));
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final WalletFragment this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                handleScrollLoad(i, j, k);
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
        });
        loadingListRow = new LoadingListRow(getActivity());
        loadingListRow.setOnClickListener(new android.view.View.OnClickListener() {

            final WalletFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Load);
                loadNextPage();
            }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
        });
        listView.addFooterView(loadingListRow);
        listAdapter = new WalletAdapter(getActivity(), walletItems, listView);
        listView.setAdapter(listAdapter);
        listView.setOnScrollListener(new android.widget.AbsListView.OnScrollListener() {

            final WalletFragment this$0;

            public void onScroll(AbsListView abslistview, int i, int j, int k)
            {
                handleScrollLoad(i, j, k);
            }

            public void onScrollStateChanged(AbsListView abslistview, int i)
            {
            }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
        });
        listAdapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final WalletFragment this$0;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                handleItemClick(i);
            }

            
            {
                this$0 = WalletFragment.this;
                super();
            }
        });
        listView.setFadingEdgeLength(0);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWalletItemsService = new GetWalletItemsService();
    }

    public void onDestroy()
    {
        super.onDestroy();
        RuntimeStateStore.getInstance().clearState(dataStateStoreKey);
    }

    public void onPause()
    {
        super.onPause();
        if (listAdapter != null)
        {
            listAdapter.pauseCacheWarming();
        }
        getWalletItemsService.cancelAllRequests();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (loadingComplete && walletItems.size() > 0 && currentOffset >= 0)
        {
            dataStateStoreKey = RuntimeStateStore.getInstance().storeState(walletItems, dataStateStoreKey);
            bundle.putSerializable("StoredStateData", dataStateStoreKey);
            bundle.putInt("StoredStateCurrentOffset", currentOffset);
            bundle.putBooleanArray("StoredStateNoMoreData", noMoreItems);
        }
    }

    protected void releaseImages()
    {
        if (listAdapter != null)
        {
            listAdapter.releaseImages();
        }
    }

    protected void restoreImages()
    {
        if (listAdapter != null)
        {
            listAdapter.restoreImages();
        }
    }

    public void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData") && bundle.containsKey("StoredStateNoMoreData") && bundle.containsKey("StoredStateCurrentOffset"))
        {
            dataStateStoreKey = bundle.getString("StoredStateData");
            walletItems = (ArrayList)RuntimeStateStore.getInstance().getState(dataStateStoreKey);
            currentOffset = bundle.getInt("StoredStateCurrentOffset");
            noMoreItems = bundle.getBooleanArray("StoredStateNoMoreData");
            boolean flag;
            if (walletItems != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            loadingComplete = flag;
        }
        if (!loadingComplete)
        {
            walletItems = new ArrayList();
            noMoreItems = new boolean[SECTION_TYPES.length];
            currentOffset = -1;
            loadingComplete = false;
        }
    }

    public boolean useCanvasBackground()
    {
        return true;
    }

    static 
    {
        SECTION_TYPES = (new com.contextlogic.wish.api.data.WishWalletItem.WalletItemType[] {
            com.contextlogic.wish.api.data.WishWalletItem.WalletItemType.GiftCard
        });
    }





/*
    static boolean access$302(WalletFragment walletfragment, boolean flag)
    {
        walletfragment.updatingList = flag;
        return flag;
    }

*/


}
