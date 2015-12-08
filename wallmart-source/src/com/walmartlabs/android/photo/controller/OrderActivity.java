// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.app.Dialog;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.user.Store;
import com.walmartlabs.android.photo.service.order.OrderProgress;
import com.walmartlabs.android.photo.service.order.OrderService;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.view.SystemBarTintHelper;
import com.walmartlabs.android.photo.view.upload.UploadPickupView;
import com.walmartlabs.android.photo.view.upload.UploadProgressView;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            PhotoAppCompatActivity

public class OrderActivity extends PhotoAppCompatActivity
{
    public static class ConfirmCancelDialogFragment extends DialogFragment
    {

        public Dialog onCreateDialog(Bundle bundle)
        {
            bundle = new com.walmart.android.ui.dialog.AlertDialog.Builder(getActivity());
            bundle.setTitle(com.walmartlabs.android.photo.R.string.photo_cancel_upload_confirm_title).setMessage(com.walmartlabs.android.photo.R.string.photo_cancel_upload_confirm_message).setPositiveButton(getString(com.walmartlabs.android.photo.R.string.photo_yes), new android.content.DialogInterface.OnClickListener() {

                final ConfirmCancelDialogFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    ((OrderActivity)getActivity()).onCancelRequested();
                }

            
            {
                this$0 = ConfirmCancelDialogFragment.this;
                super();
            }
            }).setNegativeButton(getString(com.walmartlabs.android.photo.R.string.photo_no), new android.content.DialogInterface.OnClickListener() {

                final ConfirmCancelDialogFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = ConfirmCancelDialogFragment.this;
                super();
            }
            });
            return bundle.create();
        }

        public ConfirmCancelDialogFragment()
        {
        }
    }


    private static final String TAG = com/walmartlabs/android/photo/controller/OrderActivity.getSimpleName();
    private OrderService mBoundService;
    private ServiceConnection mConnection;
    private boolean mIsBound;
    private GoogleMap mMap;
    private Intent mOrderIntent;
    private boolean mPaused;
    private boolean mStoreLocationSet;
    private UploadPickupView mUploadPickupView;
    private UploadProgressView mUploadProgressView;

    public OrderActivity()
    {
        mConnection = new ServiceConnection() {

            final OrderActivity this$0;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                mBoundService = ((com.walmartlabs.android.photo.service.order.OrderService.LocalBinder)ibinder).getService();
                mOrderIntent = mBoundService.getStartingIntent();
                if (!mBoundService.wasExplicitlyStarted())
                {
                    findViewById(com.walmartlabs.android.photo.R.id.main_layout).setVisibility(8);
                    findViewById(com.walmartlabs.android.photo.R.id.idle_layout).setVisibility(0);
                    ((Button)findViewById(com.walmartlabs.android.photo.R.id.idle_button)).setOnClickListener(new android.view.View.OnClickListener() {

                        final _cls3 this$1;

                        public void onClick(View view)
                        {
                            finish();
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    });
                    return;
                } else
                {
                    mBoundService.setOrderServiceListener(new com.walmartlabs.android.photo.service.order.OrderService.OrderServiceListener() {

                        final _cls3 this$1;

                        public void onNewPhotoUploading(final DevicePhoto photo, int i)
                        {
                            runOnUiThread(i. new Runnable() {

                                final _cls2 this$2;
                                final int val$count;
                                final DevicePhoto val$photo;

                                public void run()
                                {
                                    mUploadProgressView.addPhotoToStack(photo, count);
                                }

            
            {
                this$2 = final__pcls2;
                photo = devicephoto;
                count = I.this;
                super();
            }
                            });
                        }

                        public void onUploadStatus(OrderProgress orderprogress)
                        {
                            runOnUiThread(orderprogress. new Runnable() {

                                final _cls2 this$2;
                                final OrderProgress val$status;

                                public void run()
                                {
                                    if (status != null && status.orderSuccessful())
                                    {
                                        getSupportActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_order_complete));
                                    }
                                    if (status != null && status.uploadsDone())
                                    {
                                        dismissCancellationDialog();
                                    }
                                    initForProgress(status);
                                }

            
            {
                this$2 = final__pcls2;
                status = OrderProgress.this;
                super();
            }
                            });
                        }

                        public boolean visible()
                        {
                            return !mPaused;
                        }

            
            {
                this$1 = _cls3.this;
                super();
            }
                    });
                    initForProgress(mBoundService.getOrderProgress());
                    mUploadProgressView.addPhotoToStack(mBoundService.getOrderProgress().getCurrentPhoto(), mBoundService.getOrderProgress().totalProgress());
                    return;
                }
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                mBoundService = null;
            }

            
            {
                this$0 = OrderActivity.this;
                super();
            }
        };
    }

    private void dismissCancellationDialog()
    {
        android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag(com/walmartlabs/android/photo/controller/OrderActivity$ConfirmCancelDialogFragment.getName());
        if (fragment != null)
        {
            ((DialogFragment)fragment).dismissAllowingStateLoss();
        }
    }

    private void doBindService()
    {
        if (bindService(new Intent(this, com/walmartlabs/android/photo/service/order/OrderService), mConnection, 1))
        {
            mIsBound = true;
        }
    }

    private void doUnbindService()
    {
        if (mIsBound)
        {
            if (mBoundService != null)
            {
                mBoundService.setOrderServiceListener(null);
            }
            unbindService(mConnection);
            mIsBound = false;
        }
    }

    private void initForProgress(OrderProgress orderprogress)
    {
        mUploadProgressView.setModel(orderprogress);
        mUploadPickupView.setPickupInfo(orderprogress.getPickupStore());
        if (orderprogress.getPickupStore() != null && !mStoreLocationSet)
        {
            setupMap(orderprogress.getPickupStore());
            mStoreLocationSet = true;
        }
    }

    private void launchMaps(Store store)
    {
        store = new Intent("android.intent.action.VIEW", Uri.parse((new StringBuilder()).append("geo:0,0?q=Walmart, ").append(store.getStreet()).append(", ").append(store.getCity()).append(",").append(store.getState()).toString()));
        if (store.resolveActivity(getPackageManager()) != null)
        {
            startActivity(store);
        }
    }

    private void setupMap(final Store store)
    {
        if (mMap != null)
        {
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(store.getLatitude(), store.getLongitude()), 14F));
            mMap.addMarker((new MarkerOptions()).position(new LatLng(store.getLatitude(), store.getLongitude())).icon(BitmapDescriptorFactory.fromResource(com.walmartlabs.android.photo.R.drawable.photo_map_marker)).title(store.getName()));
            mMap.setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {

                final OrderActivity this$0;
                final Store val$store;

                public boolean onMarkerClick(Marker marker)
                {
                    launchMaps(store);
                    return true;
                }

            
            {
                this$0 = OrderActivity.this;
                store = store1;
                super();
            }
            });
            mMap.setOnMapClickListener(new com.google.android.gms.maps.GoogleMap.OnMapClickListener() {

                final OrderActivity this$0;
                final Store val$store;

                public void onMapClick(LatLng latlng)
                {
                    launchMaps(store);
                }

            
            {
                this$0 = OrderActivity.this;
                store = store1;
                super();
            }
            });
        }
    }

    public void onCancelRequested()
    {
        if (mBoundService != null)
        {
            mBoundService.cancelCurrentOrder();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.walmartlabs.android.photo.R.layout.photo_activity_order);
        getSupportActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_order_prints));
        mUploadProgressView = (UploadProgressView)findViewById(com.walmartlabs.android.photo.R.id.upload_progress_layout);
        mUploadProgressView.setUploadProgressViewListener(new com.walmartlabs.android.photo.view.upload.UploadProgressView.UploadProgressViewListener() {

            final OrderActivity this$0;

            public void onCancelClick()
            {
                if (mBoundService != null)
                {
                    (new ConfirmCancelDialogFragment()).show(getSupportFragmentManager(), com/walmartlabs/android/photo/controller/OrderActivity$ConfirmCancelDialogFragment.getName());
                }
            }

            public void onRetryClick()
            {
                if (mOrderIntent != null)
                {
                    mUploadProgressView.reset();
                    startService(mOrderIntent);
                }
            }

            
            {
                this$0 = OrderActivity.this;
                super();
            }
        });
        mUploadPickupView = (UploadPickupView)findViewById(com.walmartlabs.android.photo.R.id.upload_pickup_layout);
        mUploadPickupView.setUploadPickupViewListener(new com.walmartlabs.android.photo.view.upload.UploadPickupView.UploadPickupViewListener() {

            final OrderActivity this$0;

            public void onDoneClick()
            {
                finish();
            }

            public void onPhoneClick(String s)
            {
                Intent intent = new Intent("android.intent.action.DIAL");
                intent.setData(Uri.parse((new StringBuilder()).append("tel:").append(s).toString()));
                startActivity(intent);
            }

            
            {
                this$0 = OrderActivity.this;
                super();
            }
        });
        bundle = (SupportMapFragment)getSupportFragmentManager().findFragmentById(com.walmartlabs.android.photo.R.id.map);
        if (bundle != null)
        {
            mMap = bundle.getMap();
            if (mMap == null)
            {
                PhotoLogger.get().w(TAG, "Failed to get map from layout");
            } else
            {
                bundle = mMap.getUiSettings();
                bundle.setCompassEnabled(false);
                bundle.setZoomControlsEnabled(false);
                bundle.setMapToolbarEnabled(false);
            }
        }
        SystemBarTintHelper.enableTint(this);
        doBindService();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        mUploadProgressView.notifyDestroy();
        doUnbindService();
    }

    public void onPause()
    {
        super.onPause();
        mPaused = true;
    }

    public void onResume()
    {
        super.onResume();
        dismissCancellationDialog();
        mPaused = false;
    }




/*
    static OrderService access$002(OrderActivity orderactivity, OrderService orderservice)
    {
        orderactivity.mBoundService = orderservice;
        return orderservice;
    }

*/



/*
    static Intent access$102(OrderActivity orderactivity, Intent intent)
    {
        orderactivity.mOrderIntent = intent;
        return intent;
    }

*/





}
