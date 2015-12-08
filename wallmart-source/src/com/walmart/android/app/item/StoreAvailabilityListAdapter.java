// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.item;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.LatLng;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.service.AsyncCallbackWrapper;
import com.walmart.android.service.item.BuyingOptionModel;
import com.walmart.android.service.item.ItemPrice;
import com.walmart.android.service.item.ItemService;
import com.walmart.android.service.item.StoreItemModel;
import com.walmart.android.util.AvailabilityUtils;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.util.WalmartPrice;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Services;
import com.walmartlabs.kangaroo.CallbackSameThread;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;
import com.walmartlabs.storelocator.StoreData;
import com.walmartlabs.storelocator.StoreLocationManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class StoreAvailabilityListAdapter extends BaseAdapter
{
    public static interface StoreAvailabilityListener
    {

        public abstract void onEmptyStoreAvailabilityResponse();

        public abstract void onErrorLoadingStoreAvailability(int i);

        public abstract void onErrorLoadingStores(int i);

        public abstract void onErrorRequestingLocation(int i);

        public abstract void onErrorRequestingLocation(ConnectionResult connectionresult);

        public abstract void onLoadCompleted(boolean flag);
    }


    private static final String TAG = com/walmart/android/app/item/StoreAvailabilityListAdapter.getSimpleName();
    private static final int VIEW_TYPE_LOADING = 0;
    private static final int VIEW_TYPE_REGULAR = 2;
    private static final int VIEW_TYPE_SUBHEADER = 1;
    private final boolean mAutoLoad;
    private final Context mContext;
    private boolean mHasReachedEnd;
    private boolean mInitialLoadDone;
    private boolean mIsLoading;
    private final String mItemId;
    private final String mItemUpc;
    private LatLng mLocation;
    private final StoreLocationManager mLocationManager;
    private final boolean mShowPrices;
    private final List mStoreAvailabilityList = new ArrayList();
    private StoreAvailabilityListener mStoreAvailabilityListener;
    private final HashMap mStoreMap = new HashMap();
    private final WalmartStore mUserStore;
    private final ArrayList mViewTypes = new ArrayList();

    public StoreAvailabilityListAdapter(Context context, String s, String s1, boolean flag, boolean flag1)
    {
        mContext = context;
        mItemUpc = s;
        mItemId = s1;
        mLocationManager = StoreLocationManager.getInstance(context);
        mUserStore = SharedPreferencesUtil.getSavedLocalAdJsonStore(mContext);
        mAutoLoad = flag;
        mIsLoading = mAutoLoad;
        mShowPrices = flag1;
        mHasReachedEnd = true;
        setViewTypes();
    }

    private void addToStoresMap(List list)
    {
        WalmartStore walmartstore;
        for (list = list.iterator(); list.hasNext(); mStoreMap.put(walmartstore.getId(), walmartstore))
        {
            walmartstore = (WalmartStore)list.next();
        }

    }

    private void addUsersStore()
    {
        Object obj = SharedPreferencesUtil.getSavedLocalAdJsonStore(mContext);
        if (obj != null)
        {
            boolean flag1 = false;
            obj = ((WalmartStore) (obj)).getId();
            Iterator iterator = mStoreAvailabilityList.iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break;
                }
                StoreItemModel storeitemmodel = (StoreItemModel)iterator.next();
                if (storeitemmodel == null || !((String) (obj)).equals(storeitemmodel.getStoreId()))
                {
                    continue;
                }
                flag = true;
                break;
            } while (true);
            if (!flag)
            {
                mStoreAvailabilityList.add((new com.walmart.android.service.item.StoreItemModel.Builder()).storeId(((String) (obj))).build());
            }
        }
    }

    private void loadAvailabilityDataForStores(List list)
    {
        HashSet hashset = new HashSet();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String s = ((WalmartStore)list.next()).getId();
            boolean flag1 = true;
            Iterator iterator = mStoreAvailabilityList.iterator();
            boolean flag;
            do
            {
                flag = flag1;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!((StoreItemModel)iterator.next()).getStoreId().equals(s))
                {
                    continue;
                }
                flag = false;
                break;
            } while (true);
            if (flag)
            {
                hashset.add(s);
            }
        } while (true);
        if (!hashset.isEmpty())
        {
            list = (String[])hashset.toArray(new String[hashset.size()]);
            if (mItemId != null)
            {
                list = Services.get().getItemService().getBuyingOption(mItemId, list);
            } else
            {
                list = Services.get().getItemService().getBuyingOptionByUpc(mItemUpc, list);
            }
            list.addCallback(new CallbackSameThread() {

                final StoreAvailabilityListAdapter this$0;

                public void onResultSameThread(Request request, Result result)
                {
                    super.onResultSameThread(request, result);
                    mIsLoading = false;
                    if (!result.successful() || !result.hasData()) goto _L2; else goto _L1
_L1:
                    request = ((BuyingOptionModel)result.getData()).getStoreItemModels();
                    setStoreItemModels(request);
                    if (request.isEmpty() && mStoreAvailabilityListener != null)
                    {
                        mStoreAvailabilityListener.onEmptyStoreAvailabilityResponse();
                    }
_L4:
                    notifyDataSetChanged();
                    notifyInitialLoadDone();
                    return;
_L2:
                    if (mStoreAvailabilityListener != null)
                    {
                        mStoreAvailabilityListener.onErrorLoadingStores(AsyncCallbackWrapper.translateError(result).intValue());
                    }
                    if (true) goto _L4; else goto _L3
_L3:
                }

            
            {
                this$0 = StoreAvailabilityListAdapter.this;
                super();
            }
            });
            mIsLoading = true;
        } else
        {
            mIsLoading = false;
            notifyInitialLoadDone();
        }
        mHasReachedEnd = true;
        notifyDataSetChanged();
    }

    private void loadNearbyStores()
    {
        List list = mLocationManager.getNearbyByStores();
        boolean flag;
        if (list.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (mUserStore != null)
        {
            list.add(0, mUserStore);
        }
        if (flag)
        {
            loadStores();
            return;
        } else
        {
            addToStoresMap(list);
            loadAvailabilityDataForStores(list.subList(0, Math.min(10, list.size())));
            return;
        }
    }

    private void loadStores()
    {
        final com.walmartlabs.storelocator.StoreService.GetStoresCallback callback = new com.walmartlabs.storelocator.StoreService.GetStoresCallback() {

            final StoreAvailabilityListAdapter this$0;

            public void onFailure(int i)
            {
                if (mStoreAvailabilityListener != null)
                {
                    mStoreAvailabilityListener.onErrorLoadingStores(i);
                }
                mIsLoading = false;
                mHasReachedEnd = true;
                notifyDataSetChanged();
                notifyInitialLoadDone();
            }

            public void onStoresReceived(WalmartStore awalmartstore[])
            {
                if (awalmartstore != null && awalmartstore.length > 0)
                {
                    awalmartstore = new ArrayList(Arrays.asList(awalmartstore));
                    addToStoresMap(awalmartstore);
                    loadAvailabilityDataForStores(awalmartstore);
                    return;
                }
                if (mStoreAvailabilityListener != null)
                {
                    mStoreAvailabilityListener.onErrorLoadingStoreAvailability(10000);
                }
                mIsLoading = false;
                mHasReachedEnd = true;
                notifyDataSetChanged();
                notifyInitialLoadDone();
            }

            public volatile void onStoresReceived(StoreData astoredata[])
            {
                onStoresReceived((WalmartStore[])astoredata);
            }

            
            {
                this$0 = StoreAvailabilityListAdapter.this;
                super();
            }
        };
        if (mLocation == null) goto _L2; else goto _L1
_L1:
        mLocationManager.loadStores(mLocation, 50, 0, 10, callback);
_L4:
        mIsLoading = true;
        notifyDataSetChanged();
        return;
_L2:
        if (!mLocationManager.loadNearbyStores(callback))
        {
            mLocationManager.requestLocationWithDialogs(mContext, new com.walmartlabs.storelocator.StoreLocationManager.LocationCallbackAdapter() {

                final StoreAvailabilityListAdapter this$0;
                final com.walmartlabs.storelocator.StoreService.GetStoresCallback val$callback;

                public void onError(int i)
                {
                    if (mStoreAvailabilityListener != null)
                    {
                        mStoreAvailabilityListener.onErrorRequestingLocation(i);
                    }
                    mIsLoading = false;
                    mHasReachedEnd = true;
                    notifyDataSetChanged();
                    notifyInitialLoadDone();
                }

                public void onError(ConnectionResult connectionresult)
                {
                    if (mStoreAvailabilityListener != null)
                    {
                        mStoreAvailabilityListener.onErrorRequestingLocation(connectionresult);
                    }
                    mIsLoading = false;
                    mHasReachedEnd = true;
                    notifyDataSetChanged();
                    notifyInitialLoadDone();
                }

                public void onFoundLocation(LatLng latlng, Location location)
                {
                    mLocationManager.loadNearbyStores(callback);
                }

            
            {
                this$0 = StoreAvailabilityListAdapter.this;
                callback = getstorescallback;
                super();
            }
            });
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void notifyInitialLoadDone()
    {
        if (mStoreAvailabilityListener != null)
        {
            StoreAvailabilityListener storeavailabilitylistener = mStoreAvailabilityListener;
            boolean flag;
            if (!mInitialLoadDone)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            storeavailabilitylistener.onLoadCompleted(flag);
        }
        if (!mInitialLoadDone)
        {
            mInitialLoadDone = true;
        }
    }

    private int offsetPosition(int i)
    {
        if (i == 1)
        {
            return 0;
        } else
        {
            return i - 2;
        }
    }

    private void populateFields(View view, StoreItemModel storeitemmodel)
    {
        Context context = view.getContext();
        Object obj = (WalmartStore)mStoreMap.get(storeitemmodel.getStoreId());
        String as[] = WalmartStore.getAddressLines(((WalmartStore) (obj)).getAddress());
        ViewUtil.setText(0x7f100594, view, as[0]);
        ViewUtil.setText(0x7f100595, view, as[1]);
        Object obj1 = (TextView)ViewUtil.findViewById(view, 0x7f100593);
        if (((WalmartStore) (obj)).distanceFromSource >= 0.0D)
        {
            ((TextView) (obj1)).setVisibility(0);
            ((TextView) (obj1)).setText(mContext.getString(0x7f090589, new Object[] {
                Double.valueOf(((WalmartStore) (obj)).distanceFromSource)
            }));
        } else
        {
            ((TextView) (obj1)).setVisibility(4);
        }
        obj1 = ((WalmartStore) (obj)).getDescription();
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (((String) (obj1)).trim().equals("Walmart"))
            {
                obj = "Walmart Store";
            }
        }
        ViewUtil.setText(0x7f10004f, view, ((CharSequence) (obj)));
        ViewUtil.setText(0x7f1001f3, view, AvailabilityUtils.getStockString(context, storeitemmodel.getStockStatus()));
        if (mShowPrices && storeitemmodel.getItemPrice() != null && !TextUtils.isEmpty(storeitemmodel.getItemPrice().getPriceString()))
        {
            ViewUtil.setText(0x7f1000a8, view, WalmartPrice.fromString(storeitemmodel.getItemPrice().getPriceString()).toString());
            return;
        } else
        {
            view.findViewById(0x7f1000a8).setVisibility(4);
            return;
        }
    }

    private void setStoreItemModels(List list)
    {
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                StoreItemModel storeitemmodel = (StoreItemModel)list.next();
                if (mStoreMap.containsKey(storeitemmodel.getStoreId()))
                {
                    mStoreAvailabilityList.add(storeitemmodel);
                }
            } while (true);
            if (mLocation == null)
            {
                addUsersStore();
            }
            sort();
        }
    }

    private void setViewTypes()
    {
        mViewTypes.clear();
        int j = mStoreAvailabilityList.size();
        if (j > 0)
        {
            mViewTypes.add(Integer.valueOf(1));
            mViewTypes.add(Integer.valueOf(2));
        }
        if (j > 1)
        {
            mViewTypes.add(Integer.valueOf(1));
            mViewTypes.add(Integer.valueOf(2));
        }
        for (int i = 0; i < j - 2; i++)
        {
            mViewTypes.add(Integer.valueOf(2));
        }

        if (mIsLoading)
        {
            if (j == 1)
            {
                mViewTypes.add(Integer.valueOf(1));
            }
            mViewTypes.add(Integer.valueOf(0));
        }
    }

    private void sort()
    {
        Collections.sort(mStoreAvailabilityList, new Comparator() {

            final StoreAvailabilityListAdapter this$0;

            public int compare(StoreItemModel storeitemmodel, StoreItemModel storeitemmodel1)
            {
                WalmartStore walmartstore;
                byte byte0;
                byte byte1;
                byte1 = 0;
                storeitemmodel = (WalmartStore)mStoreMap.get(storeitemmodel.getStoreId());
                storeitemmodel1 = (WalmartStore)mStoreMap.get(storeitemmodel1.getStoreId());
                walmartstore = SharedPreferencesUtil.getSavedLocalAdJsonStore(mContext);
                byte0 = byte1;
                if (walmartstore == null) goto _L2; else goto _L1
_L1:
                if (!walmartstore.getId().equals(storeitemmodel.getId())) goto _L4; else goto _L3
_L3:
                byte0 = -1;
_L2:
                byte1 = byte0;
                if (byte0 != 0) goto _L6; else goto _L5
_L5:
                if (((WalmartStore) (storeitemmodel)).distanceFromSource >= ((WalmartStore) (storeitemmodel1)).distanceFromSource) goto _L8; else goto _L7
_L7:
                byte1 = -1;
_L6:
                return byte1;
_L4:
                byte0 = byte1;
                if (walmartstore.getId().equals(storeitemmodel1.getId()))
                {
                    byte0 = 1;
                }
                continue; /* Loop/switch isn't completed */
_L8:
                byte1 = byte0;
                if (((WalmartStore) (storeitemmodel)).distanceFromSource <= ((WalmartStore) (storeitemmodel1)).distanceFromSource) goto _L6; else goto _L9
_L9:
                return 1;
                if (true) goto _L2; else goto _L10
_L10:
            }

            public volatile int compare(Object obj, Object obj1)
            {
                return compare((StoreItemModel)obj, (StoreItemModel)obj1);
            }

            
            {
                this$0 = StoreAvailabilityListAdapter.this;
                super();
            }
        });
    }

    public int getCount()
    {
        return mViewTypes.size();
    }

    public Object getItem(int i)
    {
        if (((Integer)mViewTypes.get(i)).intValue() == 2)
        {
            return mStoreMap.get(((StoreItemModel)mStoreAvailabilityList.get(offsetPosition(i))).getStoreId());
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        return 0L;
    }

    public int getItemViewType(int i)
    {
        return ((Integer)mViewTypes.get(i)).intValue();
    }

    public int getStoreCount()
    {
        return mStoreAvailabilityList.size();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        ((Integer)mViewTypes.get(i)).intValue();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 58
    //                   2 137;
           goto _L1 _L2 _L3 _L4
_L1:
        return view;
_L2:
        if (view == null)
        {
            return ViewUtil.inflate(mContext, 0x7f04008f, viewgroup);
        }
          goto _L1
_L3:
        TextView textview = (TextView)view;
        view = textview;
        if (textview == null)
        {
            view = (TextView)ViewUtil.inflate(mContext, 0x7f04019f, viewgroup);
        }
        if (i == 0)
        {
            if (mLocation != null)
            {
                i = 0x7f09058a;
            } else
            if (mUserStore != null)
            {
                i = 0x7f09058d;
            } else
            {
                i = 0x7f09058c;
            }
        } else
        {
            i = 0x7f09058b;
        }
        view.setText(i);
        return view;
_L4:
        View view1 = view;
        if (view == null)
        {
            view1 = ViewUtil.inflate(viewgroup.getContext(), 0x7f04019e, viewgroup);
        }
        populateFields(view1, (StoreItemModel)mStoreAvailabilityList.get(offsetPosition(i)));
        return view1;
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public void handleOnScroll(AbsListView abslistview, int i, int j, int k)
    {
        k = getCount();
        if (!isLoadingItems() && !hasReachedEnd() && i + j >= k)
        {
            loadMoreItemsAsync();
        }
    }

    public boolean hasReachedEnd()
    {
        return mHasReachedEnd;
    }

    public boolean isEnabled(int i)
    {
        return ((Integer)mViewTypes.get(i)).intValue() == 2;
    }

    public boolean isLoadingItems()
    {
        return mIsLoading;
    }

    public void loadInitialAvailabilityData()
    {
        List list = mLocationManager.getNearbyByStores();
        WalmartStore walmartstore = SharedPreferencesUtil.getSavedLocalAdJsonStore(mContext);
        if (walmartstore != null)
        {
            list.add(walmartstore);
        }
        addToStoresMap(list);
        if (mAutoLoad)
        {
            loadMoreItemsAsync();
            return;
        } else
        {
            notifyInitialLoadDone();
            return;
        }
    }

    public void loadMoreItemsAsync()
    {
        if (mLocation == null)
        {
            loadNearbyStores();
            return;
        } else
        {
            loadStores();
            return;
        }
    }

    public void notifyDataSetChanged()
    {
        setViewTypes();
        super.notifyDataSetChanged();
    }

    public void reload()
    {
        reset();
        loadMoreItemsAsync();
    }

    public void reset()
    {
        mStoreAvailabilityList.clear();
        mViewTypes.clear();
        mHasReachedEnd = false;
        mIsLoading = true;
        notifyDataSetChanged();
    }

    public void setLocation(LatLng latlng)
    {
        mLocation = latlng;
        loadMoreItemsAsync();
    }

    public void setStoreAvailabilityListener(StoreAvailabilityListener storeavailabilitylistener)
    {
        mStoreAvailabilityListener = storeavailabilitylistener;
    }






/*
    static boolean access$302(StoreAvailabilityListAdapter storeavailabilitylistadapter, boolean flag)
    {
        storeavailabilitylistadapter.mIsLoading = flag;
        return flag;
    }

*/


/*
    static boolean access$402(StoreAvailabilityListAdapter storeavailabilitylistadapter, boolean flag)
    {
        storeavailabilitylistadapter.mHasReachedEnd = flag;
        return flag;
    }

*/





}
