// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            UpdateDisplayState, InAppNotification, MixpanelAPI

public class InAppFragment extends Fragment
{
    private class SineBounceInterpolator
        implements Interpolator
    {

        final InAppFragment this$0;

        public float getInterpolation(float f)
        {
            return (float)(-(Math.pow(2.7182818284590451D, -8F * f) * Math.cos(12F * f))) + 1.0F;
        }

        public SineBounceInterpolator()
        {
            this$0 = InAppFragment.this;
            super();
        }
    }


    private static final String LOGTAG = "MixpanelAPI.InAppFrag";
    private static final int MINI_REMOVE_TIME = 10000;
    private boolean mCleanedUp;
    private GestureDetector mDetector;
    private Runnable mDisplayMini;
    private UpdateDisplayState.DisplayState.InAppNotificationState mDisplayState;
    private int mDisplayStateId;
    private Handler mHandler;
    private View mInAppView;
    private MixpanelAPI mMixpanel;
    private Activity mParent;
    private Runnable mRemover;

    public InAppFragment()
    {
    }

    private void cleanUp()
    {
        if (!mCleanedUp)
        {
            mHandler.removeCallbacks(mRemover);
            mHandler.removeCallbacks(mDisplayMini);
            UpdateDisplayState.releaseDisplayState(mDisplayStateId);
            mParent.getFragmentManager().beginTransaction().remove(this).commit();
        }
        mCleanedUp = true;
    }

    private void remove()
    {
        if (mParent != null && !mCleanedUp)
        {
            mHandler.removeCallbacks(mRemover);
            mHandler.removeCallbacks(mDisplayMini);
            mParent.getFragmentManager().beginTransaction().setCustomAnimations(0, com.mixpanel.android.R.anim.com_mixpanel_android_slide_down).remove(this).commit();
            UpdateDisplayState.releaseDisplayState(mDisplayStateId);
            mCleanedUp = true;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mParent = activity;
        if (mDisplayState == null)
        {
            cleanUp();
            return;
        } else
        {
            mHandler = new Handler();
            mRemover = new Runnable() {

                final InAppFragment this$0;

                public void run()
                {
                    remove();
                }

            
            {
                this$0 = InAppFragment.this;
                super();
            }
            };
            mDisplayMini = new Runnable() {

                final InAppFragment this$0;

                public void run()
                {
                    mInAppView.setVisibility(0);
                    mInAppView.setBackgroundColor(mDisplayState.getHighlightColor());
                    mInAppView.setOnTouchListener(new android.view.View.OnTouchListener() {

                        final _cls2 this$1;

                        public boolean onTouch(View view, MotionEvent motionevent)
                        {
                            return mDetector.onTouchEvent(motionevent);
                        }

            
            {
                this$1 = _cls2.this;
                super();
            }
                    });
                    ImageView imageview = (ImageView)mInAppView.findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_image);
                    float f = TypedValue.applyDimension(1, 75F, mParent.getResources().getDisplayMetrics());
                    Object obj = new TranslateAnimation(0.0F, 0.0F, f, 0.0F);
                    ((TranslateAnimation) (obj)).setInterpolator(new DecelerateInterpolator());
                    ((TranslateAnimation) (obj)).setDuration(200L);
                    mInAppView.startAnimation(((android.view.animation.Animation) (obj)));
                    obj = new ScaleAnimation(0.0F, 1.0F, 0.0F, 1.0F, f / 2.0F, f / 2.0F);
                    ((ScaleAnimation) (obj)).setInterpolator(new SineBounceInterpolator());
                    ((ScaleAnimation) (obj)).setDuration(400L);
                    ((ScaleAnimation) (obj)).setStartOffset(200L);
                    imageview.startAnimation(((android.view.animation.Animation) (obj)));
                }


            
            {
                this$0 = InAppFragment.this;
                super();
            }
            };
            mDetector = new GestureDetector(activity, new android.view.GestureDetector.OnGestureListener() {

                final InAppFragment this$0;

                public boolean onDown(MotionEvent motionevent)
                {
                    return true;
                }

                public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
                {
                    if (f1 > 0.0F)
                    {
                        remove();
                    }
                    return true;
                }

                public void onLongPress(MotionEvent motionevent)
                {
                }

                public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
                {
                    return false;
                }

                public void onShowPress(MotionEvent motionevent)
                {
                }

                public boolean onSingleTapUp(MotionEvent motionevent)
                {
                    motionevent = mDisplayState.getInAppNotification();
                    Object obj = motionevent.getCallToActionUrl();
                    if (obj != null && ((String) (obj)).length() > 0)
                    {
                        try
                        {
                            obj = Uri.parse(((String) (obj)));
                        }
                        // Misplaced declaration of an exception variable
                        catch (MotionEvent motionevent)
                        {
                            Log.i("MixpanelAPI.InAppFrag", "Can't parse notification URI, will not take any action", motionevent);
                            return true;
                        }
                        try
                        {
                            Intent intent = new Intent("android.intent.action.VIEW", ((Uri) (obj)));
                            mParent.startActivity(intent);
                            mMixpanel.getPeople().trackNotification("$campaign_open", motionevent);
                        }
                        // Misplaced declaration of an exception variable
                        catch (MotionEvent motionevent)
                        {
                            Log.i("MixpanelAPI.InAppFrag", (new StringBuilder("User doesn't have an activity for notification URI ")).append(obj).toString());
                        }
                    }
                    remove();
                    return true;
                }

            
            {
                this$0 = InAppFragment.this;
                super();
            }
            });
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mCleanedUp = false;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        if (mDisplayState == null)
        {
            cleanUp();
        } else
        {
            mInAppView = layoutinflater.inflate(com.mixpanel.android.R.layout.com_mixpanel_android_activity_notification_mini, viewgroup, false);
            layoutinflater = (TextView)mInAppView.findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_title);
            viewgroup = (ImageView)mInAppView.findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_image);
            bundle = mDisplayState.getInAppNotification();
            layoutinflater.setText(bundle.getTitle());
            viewgroup.setImageBitmap(bundle.getImage());
            mHandler.postDelayed(mRemover, 10000L);
        }
        return mInAppView;
    }

    public void onPause()
    {
        super.onPause();
        cleanUp();
    }

    public void onResume()
    {
        super.onResume();
        mHandler.postDelayed(mDisplayMini, 500L);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        cleanUp();
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        super.onStart();
        if (mCleanedUp)
        {
            mParent.getFragmentManager().beginTransaction().remove(this).commit();
        }
    }

    public void setDisplayState(MixpanelAPI mixpanelapi, int i, UpdateDisplayState.DisplayState.InAppNotificationState inappnotificationstate)
    {
        mMixpanel = mixpanelapi;
        mDisplayStateId = i;
        mDisplayState = inappnotificationstate;
    }






}
