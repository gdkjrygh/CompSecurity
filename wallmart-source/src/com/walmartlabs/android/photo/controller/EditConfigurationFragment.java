// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.model.order.PhotoSpecification;
import com.walmartlabs.android.photo.model.order.ProductConfiguration;
import com.walmartlabs.android.photo.model.products.PhotoProduct;
import com.walmartlabs.android.photo.net.LoadProductsTask;
import com.walmartlabs.android.photo.util.DeviceUtils;
import com.walmartlabs.android.photo.util.OrderUtils;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.util.RefreshTimer;
import com.walmartlabs.android.photo.util.task.BitmapLoadTask;
import com.walmartlabs.android.photo.util.task.RenderThumbnailsTask;
import com.walmartlabs.android.photo.view.PhotoDrawable;
import com.walmartlabs.android.photo.view.configuration.OrderConfigurationProductsView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            OrderAwareFragment, ConfigurationFragment, CropFragment

public class EditConfigurationFragment extends OrderAwareFragment
{

    public static final String EXTRA_SPECIFICATION = "specification";
    private static final String TAG = com/walmartlabs/android/photo/controller/ConfigurationFragment.getSimpleName();
    private View mBaseView;
    private BitmapLoadTask mBitmapLoadTask;
    private LoadProductsTask mLoadProductsTask;
    private OrderConfigurationProductsView mMainContentView;
    private com.walmartlabs.android.photo.model.order.PendingOrder.PendingOrderListener mOrderListener;
    private BitmapLoadTask mRenderThumbnailsTask;
    private PhotoSpecification mSelectedSpecification;

    public EditConfigurationFragment()
    {
    }

    private void delete()
    {
        getOrder().removeSpecification(mSelectedSpecification);
        mSelectedSpecification = null;
        refreshProductsView();
    }

    private void doRefresh()
    {
        (new RefreshTimer(500L) {

            final EditConfigurationFragment this$0;

            public void onRefresh()
            {
                if (isAdded())
                {
                    refreshProductsView();
                }
            }

            
            {
                this$0 = EditConfigurationFragment.this;
                super(l);
            }
        }).start();
    }

    private Map getWarningsMap(PhotoSpecification photospecification, List list)
    {
        HashMap hashmap = new HashMap();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) 
        {
            PhotoProduct photoproduct = (PhotoProduct)iterator.next();
            list = photospecification.getConfigurationForProduct(photoproduct);
            DevicePhoto devicephoto = photospecification.getPhoto();
            boolean flag;
            if (list != null)
            {
                list = list.getCrop();
            } else
            {
                list = null;
            }
            if (!PhotoUtils.resolutionOk(devicephoto, photoproduct, list))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashmap.put(photoproduct, Boolean.valueOf(flag));
        }
        return hashmap;
    }

    private void loadProducts(com.walmartlabs.android.photo.net.LoadProductsTask.ProductsUpdateCallback productsupdatecallback)
    {
        mLoadProductsTask = new LoadProductsTask(getActivity(), productsupdatecallback);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            mLoadProductsTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        } else
        {
            mLoadProductsTask.execute(new Void[0]);
            return;
        }
    }

    public static EditConfigurationFragment newInstance(PendingOrder pendingorder, PhotoSpecification photospecification)
    {
        EditConfigurationFragment editconfigurationfragment = new EditConfigurationFragment();
        editconfigurationfragment.setOrder(pendingorder);
        editconfigurationfragment.getArguments().putParcelable("specification", photospecification);
        return editconfigurationfragment;
    }

    private void refreshProductsView()
    {
        if (mSelectedSpecification != null)
        {
            PendingOrder pendingorder = getOrder();
            mMainContentView.setQuantities(OrderUtils.quantitiesMap(pendingorder, mSelectedSpecification.getPhoto()));
            ((TextView)mBaseView.findViewById(com.walmartlabs.android.photo.R.id.badge_count)).setText(String.valueOf(mSelectedSpecification.getTotalQuantity()));
            renderThumbnailsForProducts(mSelectedSpecification, mMainContentView.getModel());
            return;
        } else
        {
            getFragmentManager().popBackStack();
            return;
        }
    }

    private void renderThumbnailsForProducts(final PhotoSpecification specification, final List products)
    {
        if (products != null && products.size() > 0 && specification != null && specification.getPhoto() != null)
        {
            DevicePhoto devicephoto = specification.getPhoto();
            if (mRenderThumbnailsTask != null)
            {
                mRenderThumbnailsTask.cancel(true);
            }
            mRenderThumbnailsTask = new RenderThumbnailsTask(getActivity(), specification, products, new com.walmartlabs.android.photo.util.task.RenderThumbnailsTask.RenderThumbnailsCallback() {

                final EditConfigurationFragment this$0;
                final List val$products;
                final PhotoSpecification val$specification;

                public void onRendered(Map map)
                {
                    if (specification.equals(mSelectedSpecification))
                    {
                        mMainContentView.setThumbnails(map);
                        mMainContentView.setWarnings(getWarningsMap(specification, products));
                    }
                }

            
            {
                this$0 = EditConfigurationFragment.this;
                specification = photospecification;
                products = list;
                super();
            }
            });
            mRenderThumbnailsTask.execute(new DevicePhoto[] {
                devicephoto
            });
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mOrderListener = new com.walmartlabs.android.photo.model.order.PendingOrder.PendingOrderListener() {

            final EditConfigurationFragment this$0;

            public void onOrderUpdated()
            {
                refreshProductsView();
            }

            
            {
                this$0 = EditConfigurationFragment.this;
                super();
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("Order: ").append(getOrder()).toString());
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_choose_sizes));
        mBaseView = layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_fragment_edit_configuration, viewgroup, false);
        ((Button)mBaseView.findViewById(com.walmartlabs.android.photo.R.id.primary_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final EditConfigurationFragment this$0;

            public void onClick(View view)
            {
                getFragmentManager().popBackStack();
            }

            
            {
                this$0 = EditConfigurationFragment.this;
                super();
            }
        });
        ((Button)mBaseView.findViewById(com.walmartlabs.android.photo.R.id.delete_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final EditConfigurationFragment this$0;

            public void onClick(View view)
            {
                view = DialogFactory.createAlertDialog(getString(com.walmartlabs.android.photo.R.string.photo_delete_photo_confirm_title), getString(com.walmartlabs.android.photo.R.string.photo_delete_photo_confirm_message), getString(com.walmartlabs.android.photo.R.string.photo_remove), new android.content.DialogInterface.OnClickListener() {

                    final _cls3 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        delete();
                    }

            
            {
                this$1 = _cls3.this;
                super();
            }
                }, getString(com.walmartlabs.android.photo.R.string.photo_cancel), getActivity());
                view.setCancelable(false);
                view.show();
            }

            
            {
                this$0 = EditConfigurationFragment.this;
                super();
            }
        });
        layoutinflater = getArguments();
        layoutinflater.setClassLoader(com/walmartlabs/android/photo/model/order/PhotoSpecification.getClassLoader());
        mSelectedSpecification = (PhotoSpecification)layoutinflater.getParcelable("specification");
        mMainContentView = (OrderConfigurationProductsView)mBaseView.findViewById(com.walmartlabs.android.photo.R.id.products_layout);
        mMainContentView.setProductClickListener(new com.walmartlabs.android.photo.view.configuration.OrderConfigurationProductsView.ProductClickListener() {

            final EditConfigurationFragment this$0;

            public void onCropClick(PhotoProduct photoproduct)
            {
                if (mSelectedSpecification != null)
                {
                    photoproduct = CropFragment.newInstance(mSelectedSpecification, photoproduct);
                    getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.R.anim.photo_slide_in_right, com.walmartlabs.android.photo.R.anim.photo_slide_out_left, com.walmartlabs.android.photo.R.anim.photo_slide_in_left, com.walmartlabs.android.photo.R.anim.photo_slide_out_right).replace(com.walmartlabs.android.photo.R.id.content_frame, photoproduct, com/walmartlabs/android/photo/controller/CropFragment.getName()).addToBackStack("crop").commit();
                }
            }

            public void onQuantityClick(PhotoProduct photoproduct, int i)
            {
                if (mSelectedSpecification != null)
                {
                    if (i < 0)
                    {
                        getOrder().decrementProduct(mSelectedSpecification.getPhoto(), photoproduct);
                    } else
                    if (i > 0)
                    {
                        getOrder().incrementProduct(mSelectedSpecification.getPhoto(), photoproduct);
                        return;
                    }
                }
            }

            
            {
                this$0 = EditConfigurationFragment.this;
                super();
            }
        });
        mMainContentView.setModel(null, true);
        loadProducts(new com.walmartlabs.android.photo.net.LoadProductsTask.ProductsUpdateCallback() {

            final EditConfigurationFragment this$0;

            public void onUpdated(List list)
            {
                if (isAdded())
                {
                    mMainContentView.setModel(list, true);
                    refreshProductsView();
                    return;
                } else
                {
                    PhotoLogger.get().d(EditConfigurationFragment.TAG, "Ignoring products callback since fragment is not in resumed state");
                    return;
                }
            }

            
            {
                this$0 = EditConfigurationFragment.this;
                super();
            }
        });
        if (DeviceUtils.getScreenHeightDips(getActivity()) < 480)
        {
            mBaseView.findViewById(com.walmartlabs.android.photo.R.id.image_layout).setVisibility(8);
        } else
        {
            mBitmapLoadTask = new BitmapLoadTask(getActivity(), 1, new com.walmartlabs.android.photo.util.task.BitmapLoadTask.BitmapLoadCallback() {

                final EditConfigurationFragment this$0;

                public void onBitmapLoaded(PhotoDrawable photodrawable, boolean flag, Object obj)
                {
                    if (photodrawable != null && isAdded() && mSelectedSpecification != null)
                    {
                        ((ImageView)mBaseView.findViewById(com.walmartlabs.android.photo.R.id.image)).setImageDrawable(photodrawable);
                        ((TextView)mBaseView.findViewById(com.walmartlabs.android.photo.R.id.badge_count)).setText(String.valueOf(mSelectedSpecification.getTotalQuantity()));
                        mBaseView.findViewById(com.walmartlabs.android.photo.R.id.image_holder).setVisibility(0);
                    }
                }

                public void onTaskCancelled(Bitmap bitmap)
                {
                }

            
            {
                this$0 = EditConfigurationFragment.this;
                super();
            }
            });
            mBitmapLoadTask.execute(new DevicePhoto[] {
                mSelectedSpecification.getPhoto()
            });
        }
        return mBaseView;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (mLoadProductsTask != null)
        {
            mLoadProductsTask.cancel(true);
        }
        if (mRenderThumbnailsTask != null)
        {
            mRenderThumbnailsTask.cancel(true);
        }
        if (mBitmapLoadTask != null)
        {
            mBitmapLoadTask.cancel(true);
        }
        getActionBar().setDisplayHomeAsUpEnabled(false);
        getActionBar().setHomeButtonEnabled(false);
    }

    public void onPause()
    {
        super.onPause();
        getOrder().setListener(null);
    }

    public void onResume()
    {
        super.onResume();
        doRefresh();
        getOrder().setListener(mOrderListener);
    }








}
