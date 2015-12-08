// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.controller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.walmart.android.ui.DialogFactory;
import com.walmartlabs.android.photo.model.device.DeviceAlbum;
import com.walmartlabs.android.photo.model.device.DevicePhoto;
import com.walmartlabs.android.photo.model.device.DevicePhotosModel;
import com.walmartlabs.android.photo.model.order.PendingOrder;
import com.walmartlabs.android.photo.util.PhotoLogger;
import com.walmartlabs.android.photo.util.PhotoSettings;
import com.walmartlabs.android.photo.util.PhotoUtils;
import com.walmartlabs.android.photo.util.RefreshTimer;
import com.walmartlabs.android.photo.view.album.AlbumsAdapter;
import com.walmartlabs.android.photo.view.album.CheckablePhotoView;
import com.walmartlabs.android.photo.view.album.DevicePhotosAdapter;
import com.walmartlabs.android.photo.view.album.PhotoSelectionState;
import com.walmartlabs.android.photo.view.album.ScrollSpeedMonitor;
import com.walmartlabs.ui.LoadingContainerView;
import com.walmartlabs.ui.recycler.BasicViewHolder;
import com.walmartlabs.ui.recycler.GridRecyclerView;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.walmartlabs.android.photo.controller:
//            ConfigurationFragment, ReviewFragment, SelectPathDialogFragment, SinglePhotoActivity, 
//            LearnMoreActivity

public class AlbumFragment extends Fragment
    implements com.walmartlabs.android.photo.model.device.DevicePhotosModel.PhotosModelListener
{

    private static final int REQUEST_CODE_VIEW_FULLSCREEN = 1776;
    private static final String TAG = com/walmartlabs/android/photo/controller/AlbumFragment.getSimpleName();
    private DevicePhotosAdapter mAdapter;
    private Spinner mAlbumSpinner;
    private AlbumsAdapter mAlbumsAdapter;
    private GridRecyclerView mGridView;
    private boolean mHasReceivedDropDownSelection;
    private View mLayout;
    private LoadingContainerView mLoadingContainerView;
    private DevicePhotosModel mModel;
    private Button mNextButton;
    private PhotoSelectionState mSelectionState;

    public AlbumFragment()
    {
    }

    private void checkEmpty(boolean flag)
    {
        if (mAdapter != null && mAdapter.getItemCount() > 0)
        {
            mLoadingContainerView.setContentState();
            return;
        }
        if (flag)
        {
            mLoadingContainerView.setEmptyState();
            return;
        } else
        {
            mLoadingContainerView.setLoadingState();
            return;
        }
    }

    private ActionBar getActionBar()
    {
        return ((AppCompatActivity)getActivity()).getSupportActionBar();
    }

    public static AlbumFragment newInstance()
    {
        return new AlbumFragment();
    }

    private void refreshDataSource()
    {
        (new RefreshTimer(500L) {

            final AlbumFragment this$0;

            public void onRefresh()
            {
                if (isAdded())
                {
                    mModel.refresh();
                }
            }

            
            {
                this$0 = AlbumFragment.this;
                super(l);
            }
        }).start();
    }

    private void refreshForCurrentSelection()
    {
        int i = mSelectionState.size();
        Object obj = mNextButton;
        TextView textview;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Button) (obj)).setEnabled(flag);
        obj = (new StringBuilder()).append(i).append(" ").append(getResources().getQuantityString(com.walmartlabs.android.photo.R.plurals.photos, i)).append(" ").append(getString(com.walmartlabs.android.photo.R.string.photo_selected)).toString();
        textview = (TextView)mLayout.findViewById(com.walmartlabs.android.photo.R.id.selection_text);
        if (i <= 0)
        {
            obj = getString(com.walmartlabs.android.photo.R.string.photo_tap_to_select);
        }
        textview.setText(((CharSequence) (obj)));
    }

    private void setEnableListNavigationMode(boolean flag)
    {
        if (flag)
        {
            mHasReceivedDropDownSelection = false;
            getActionBar().setTitle("");
            mAlbumSpinner.setSelection(mAlbumsAdapter.indexOf(mAdapter.getDisplayedAlbum()));
            mAlbumSpinner.setOnItemSelectedListener(new android.widget.AdapterView.OnItemSelectedListener() {

                final AlbumFragment this$0;

                public void onItemSelected(AdapterView adapterview, View view, int i, long l)
                {
                    if (mHasReceivedDropDownSelection)
                    {
                        adapterview = (DeviceAlbum)mAlbumsAdapter.getItem(i);
                        mAdapter.displayAlbum(adapterview.getName());
                        refreshForCurrentSelection();
                        return;
                    } else
                    {
                        mHasReceivedDropDownSelection = true;
                        return;
                    }
                }

                public void onNothingSelected(AdapterView adapterview)
                {
                }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
            });
            getActionBar().setDisplayShowCustomEnabled(true);
            getActionBar().setCustomView(mAlbumSpinner);
            return;
        } else
        {
            getActionBar().setDisplayShowCustomEnabled(false);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1776)
        {
            if (intent != null)
            {
                i = intent.getIntExtra("position", -1);
            } else
            {
                i = -1;
            }
            if (i >= 0 && mAdapter.getItem(i) != null && mAdapter.isValidItem(i))
            {
                boolean flag;
                if (j == -1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                mAdapter.setSelected(i, flag);
                mAdapter.notifyItemChanged(i);
                refreshForCurrentSelection();
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mModel = new DevicePhotosModel(this);
        mModel.setModelListener(this);
        mSelectionState = new PhotoSelectionState();
        mAdapter = new DevicePhotosAdapter(this, mSelectionState);
        mAdapter.setDataSource(mModel);
        mAdapter.setEnlargeListener(new com.walmartlabs.android.photo.view.album.DevicePhotosAdapter.EnlargeListener() {

            final AlbumFragment this$0;

            public void onEnlarge(DevicePhoto devicephoto, int i)
            {
                Intent intent = new Intent(getActivity(), com/walmartlabs/android/photo/controller/SinglePhotoActivity);
                boolean flag = mAdapter.isSelected(i);
                intent.putExtra("photo", devicephoto);
                intent.putExtra("position", i);
                intent.putExtra("selected", flag);
                startActivityForResult(intent, 1776);
            }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
        });
        mAlbumsAdapter = new AlbumsAdapter(getActivity());
        mAlbumsAdapter.setModel(mModel);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getActionBar().setTitle(getString(com.walmartlabs.android.photo.R.string.photo_title_name));
        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);
        mLayout = layoutinflater.inflate(com.walmartlabs.android.photo.R.layout.photo_fragment_grid, viewgroup, false);
        mAlbumSpinner = new AppCompatSpinner(getActionBar().getThemedContext());
        mAlbumSpinner.setAdapter(mAlbumsAdapter);
        mLoadingContainerView = (LoadingContainerView)mLayout.findViewById(com.walmartlabs.android.photo.R.id.grid_container);
        mGridView = (GridRecyclerView)mLoadingContainerView.getContentView();
        mGridView.setAdapter(mAdapter);
        mGridView.setOnScrollListener(new ScrollSpeedMonitor(getActivity()) {

            final AlbumFragment this$0;

            public void onSettled()
            {
                int i = mGridView.getFirstVisiblePosition();
                for (int j = mGridView.getLastVisiblePosition(); i <= j; i++)
                {
                    android.support.v7.widget.RecyclerView.ViewHolder viewholder = mGridView.findViewHolderForAdapterPosition(i);
                    if (viewholder instanceof com.walmartlabs.android.photo.view.album.DevicePhotosAdapter.DevicePhotoViewHolder)
                    {
                        mAdapter.ensureBitmapLoaded((com.walmartlabs.android.photo.view.album.DevicePhotosAdapter.DevicePhotoViewHolder)viewholder, i - mGridView.getHeaderCount());
                    }
                }

            }

            public void onSpeedStatusChange(boolean flag)
            {
                mAdapter.setTooFastToLoad(flag);
            }

            
            {
                this$0 = AlbumFragment.this;
                super(context);
            }
        });
        mGridView.setOnItemClickListener(new com.walmartlabs.ui.recycler.BasicRecyclerView.OnItemClickListener() {

            final AlbumFragment this$0;

            public void onItemClick(BasicViewHolder basicviewholder, int i)
            {
                basicviewholder = (com.walmartlabs.android.photo.view.album.DevicePhotosAdapter.DevicePhotoViewHolder)basicviewholder;
                if (mAdapter.isValidItem(i))
                {
                    mAdapter.toggleSelection(i);
                    ((com.walmartlabs.android.photo.view.album.DevicePhotosAdapter.DevicePhotoViewHolder) (basicviewholder)).photo.setChecked(mAdapter.isSelected(i));
                    refreshForCurrentSelection();
                    return;
                } else
                {
                    ((com.walmartlabs.android.photo.view.album.DevicePhotosAdapter.DevicePhotoViewHolder) (basicviewholder)).photo.setUnavailable(true);
                    DialogFactory.createAlertDialog(getString(com.walmartlabs.android.photo.R.string.photo_corrupt_title), getString(com.walmartlabs.android.photo.R.string.photo_does_not_exist), getActivity()).show();
                    return;
                }
            }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
        });
        mNextButton = (Button)mLayout.findViewById(com.walmartlabs.android.photo.R.id.ok_button);
        mNextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final AlbumFragment this$0;

            public void onClick(View view)
            {
                view = SelectPathDialogFragment.newInstance();
                view.setTargetFragment(AlbumFragment.this, 0);
                view.show(getFragmentManager(), com/walmartlabs/android/photo/controller/SelectPathDialogFragment.getName());
            }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
        });
        ((Button)mLayout.findViewById(com.walmartlabs.android.photo.R.id.hint_button)).setOnClickListener(new android.view.View.OnClickListener() {

            final AlbumFragment this$0;

            public void onClick(View view)
            {
                PhotoSettings.get(getActivity()).setFirstStartMessageDisplayed(true);
                if (PhotoUtils.canAnimate())
                {
                    view = mLayout.findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).animate();
                    view.alpha(0.0F).setListener(view. new AnimatorListenerAdapter() {

                        final _cls5 this$1;
                        final ViewPropertyAnimator val$animator;

                        public void onAnimationEnd(Animator animator1)
                        {
                            animator.setListener(null);
                            mLayout.findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).setVisibility(8);
                        }

            
            {
                this$1 = final__pcls5;
                animator = ViewPropertyAnimator.this;
                super();
            }
                    });
                } else
                {
                    mLayout.findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).setVisibility(8);
                }
                setEnableListNavigationMode(true);
            }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
        });
        if (PhotoSettings.get(getActivity()).firstStartMessageDisplayed())
        {
            mLayout.findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).setVisibility(8);
            setEnableListNavigationMode(true);
        } else
        {
            mLayout.findViewById(com.walmartlabs.android.photo.R.id.overlay_layout).setOnTouchListener(new android.view.View.OnTouchListener() {

                final AlbumFragment this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    return true;
                }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
            });
            mLayout.findViewById(com.walmartlabs.android.photo.R.id.learn_more_text).setOnClickListener(new android.view.View.OnClickListener() {

                final AlbumFragment this$0;

                public void onClick(View view)
                {
                    startActivity(new Intent(getActivity(), com/walmartlabs/android/photo/controller/LearnMoreActivity));
                }

            
            {
                this$0 = AlbumFragment.this;
                super();
            }
            });
        }
        refreshForCurrentSelection();
        return mLayout;
    }

    public void onDestroy()
    {
        super.onDestroy();
        mModel.setModelListener(null);
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        setEnableListNavigationMode(false);
        getActionBar().setDisplayHomeAsUpEnabled(false);
        getActionBar().setHomeButtonEnabled(false);
    }

    public void onModelChanged()
    {
        PhotoLogger.get().d(TAG, (new StringBuilder()).append("onModelChanged(): ").append(mModel.getPhotos().size()).append(" photos.").toString());
        mSelectionState.validate(mModel);
        mAdapter.notifyDataSetChanged();
        mAlbumsAdapter.setModel(mModel);
        mAlbumsAdapter.notifyDataSetChanged();
        checkEmpty(true);
        refreshForCurrentSelection();
    }

    public void onPathSelected(boolean flag)
    {
        Object obj1 = mSelectionState.getSelection();
        Object obj = new PendingOrder();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((PendingOrder) (obj)).initSpecification((DevicePhoto)((Iterator) (obj1)).next())) { }
        if (flag)
        {
            obj = ConfigurationFragment.newInstance(((PendingOrder) (obj)));
            getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.R.anim.photo_slide_in_right, com.walmartlabs.android.photo.R.anim.photo_slide_out_left, com.walmartlabs.android.photo.R.anim.photo_slide_in_left, com.walmartlabs.android.photo.R.anim.photo_slide_out_right).replace(com.walmartlabs.android.photo.R.id.content_frame, ((Fragment) (obj)), com/walmartlabs/android/photo/controller/ConfigurationFragment.getName()).addToBackStack("configuration").commit();
            return;
        } else
        {
            obj = ReviewFragment.newInstance(((PendingOrder) (obj)));
            getFragmentManager().beginTransaction().setCustomAnimations(com.walmartlabs.android.photo.R.anim.photo_slide_in_right, com.walmartlabs.android.photo.R.anim.photo_slide_out_left, com.walmartlabs.android.photo.R.anim.photo_slide_in_left, com.walmartlabs.android.photo.R.anim.photo_slide_out_right).replace(com.walmartlabs.android.photo.R.id.content_frame, ((Fragment) (obj)), com/walmartlabs/android/photo/controller/ReviewFragment.getName()).addToBackStack("review").commit();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        Fragment fragment = getFragmentManager().findFragmentByTag(com/walmartlabs/android/photo/controller/SelectPathDialogFragment.getName());
        if (fragment != null)
        {
            ((DialogFragment)fragment).dismissAllowingStateLoss();
        }
        checkEmpty(false);
        refreshDataSource();
    }









/*
    static boolean access$502(AlbumFragment albumfragment, boolean flag)
    {
        albumfragment.mHasReceivedDropDownSelection = flag;
        return flag;
    }

*/


}
