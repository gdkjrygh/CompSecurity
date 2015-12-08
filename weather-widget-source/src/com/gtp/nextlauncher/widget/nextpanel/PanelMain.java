// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.p;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLRelativeLayout;
import com.go.gl.view.GLView;
import com.go.gowidget.core.FullScreenNextWidgetCallback;
import com.go.gowidget.core.IFullScreenNextWidget;
import com.go.gowidget.core.WidgetCallback;
import com.gtp.nextlauncher.widget.weatherwidget.e;
import com.gtp.nextlauncher.widget.weatherwidget.h;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            CityView, h, e, Floor

public class PanelMain extends GLRelativeLayout
    implements com.go.gl.view.GLView.OnLongClickListener, IFullScreenNextWidget, h
{

    private static final long CHANGE_CITY_ANIMATION_DURATION = 500L;
    static Rect sClickRect = new Rect();
    private final float DEFAULT_ALPHA;
    private ArrayList mBgs;
    private float mBottomAlpha;
    private long mChangeCityAnimationStartTime;
    int mCityCount;
    private ArrayList mCityViewList;
    private float mCorner[];
    private int mCur;
    private e mDataHandler;
    private GLDrawable mDayBg;
    private GLDrawable mDownDrawable;
    private float mDownX;
    private float mDownY;
    private Floor mFloor;
    private FullScreenNextWidgetCallback mFullScreenNextWidgetCallback;
    private boolean mHasMove;
    private boolean mIsInCityAnimation;
    private boolean mIsLive;
    private float mLeftAlpha;
    private GLDrawable mLeftDrawable;
    private Rect mLeftRect;
    private GLDrawable mNA;
    private float mNextBgAlpha;
    private GLDrawable mNightBg;
    private float mOffX;
    private GLDrawable mRainyBg;
    private float mRightAlpha;
    private GLDrawable mRightDrawable;
    private Rect mRightRect;
    private float mStartForeD;
    private boolean mToNextCity;
    private GLDrawable mUpDrawable;
    private Rect mUpRect;
    private int mWidgetID;
    private int mXmax;
    private int mXmin;

    public PanelMain(Context context)
    {
        super(context);
        mCityViewList = new ArrayList();
        mWidgetID = -1;
        mCityCount = 0;
        mBgs = new ArrayList();
        mCur = 0;
        mLeftAlpha = 0.5F;
        mRightAlpha = 0.5F;
        mBottomAlpha = 0.5F;
        DEFAULT_ALPHA = 0.5F;
        mDownY = -1F;
        mDownX = -1F;
        mStartForeD = 50F;
        mNextBgAlpha = 0.0F;
        mLeftRect = new Rect();
        mRightRect = new Rect();
        mUpRect = new Rect();
        mIsInCityAnimation = false;
        mToNextCity = true;
        mOffX = 0.0F;
        mIsLive = false;
        mXmax = 10;
        mXmin = -1;
        mHasMove = false;
        mCorner = new float[3];
        init(context);
    }

    public PanelMain(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mCityViewList = new ArrayList();
        mWidgetID = -1;
        mCityCount = 0;
        mBgs = new ArrayList();
        mCur = 0;
        mLeftAlpha = 0.5F;
        mRightAlpha = 0.5F;
        mBottomAlpha = 0.5F;
        DEFAULT_ALPHA = 0.5F;
        mDownY = -1F;
        mDownX = -1F;
        mStartForeD = 50F;
        mNextBgAlpha = 0.0F;
        mLeftRect = new Rect();
        mRightRect = new Rect();
        mUpRect = new Rect();
        mIsInCityAnimation = false;
        mToNextCity = true;
        mOffX = 0.0F;
        mIsLive = false;
        mXmax = 10;
        mXmin = -1;
        mHasMove = false;
        mCorner = new float[3];
        init(context);
    }

    private void checkFoucus(int i, int j)
    {
        if (!mLeftRect.contains(i, j)) goto _L2; else goto _L1
_L1:
        if (mLeftAlpha != 1.0F)
        {
            mLeftAlpha = 1.0F;
            invalidate();
        }
        if (mRightAlpha == 1.0F)
        {
            mRightAlpha = 0.5F;
        }
        if (mBottomAlpha == 1.0F)
        {
            mBottomAlpha = 0.5F;
        }
_L4:
        return;
_L2:
        if (!mRightRect.contains(i, j))
        {
            break; /* Loop/switch isn't completed */
        }
        if (mRightAlpha != 1.0F)
        {
            mRightAlpha = 1.0F;
            invalidate();
        }
        if (mLeftAlpha == 1.0F)
        {
            mLeftAlpha = 0.5F;
        }
        if (mBottomAlpha == 1.0F)
        {
            mBottomAlpha = 0.5F;
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mUpRect.contains(i, j))
        {
            if (mBottomAlpha != 1.0F)
            {
                mBottomAlpha = 1.0F;
                invalidate();
            }
            if (mRightAlpha == 1.0F)
            {
                mRightAlpha = 0.5F;
            }
            if (mLeftAlpha == 1.0F)
            {
                mLeftAlpha = 0.5F;
                return;
            }
        } else
        {
            clearFoucus();
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private void clearFoucus()
    {
        mLeftAlpha = 0.5F;
        mBottomAlpha = 0.5F;
        mRightAlpha = 0.5F;
        invalidate();
    }

    private void drawBg(GLCanvas glcanvas)
    {
        int i = glcanvas.getAlpha();
        GLDrawable gldrawable;
        if (mBgs != null && mBgs.size() > mCur && mCur > -1)
        {
            gldrawable = (GLDrawable)mBgs.get(mCur);
        } else
        {
            gldrawable = mRainyBg;
        }
        if (gldrawable != null)
        {
            gldrawable.draw(glcanvas);
        }
        if (mIsInCityAnimation)
        {
            if (mToNextCity)
            {
                gldrawable = (GLDrawable)mBgs.get(getNextCityIndex());
            } else
            {
                gldrawable = (GLDrawable)mBgs.get(getPreCItyIndex());
            }
            glcanvas.setAlpha((int)((float)i * mNextBgAlpha));
            if (gldrawable != null)
            {
                gldrawable.draw(glcanvas);
            }
        }
        glcanvas.setAlpha(i);
    }

    private void foreChangeCityEnd()
    {
        ((CityView)mCityViewList.get(mCur)).clearWall();
        if (mToNextCity)
        {
            mCur = mDataHandler.g();
        } else
        {
            mCur = mDataHandler.h();
        }
        mOffX = 0.0F;
        mNextBgAlpha = 0.0F;
        invalidate();
    }

    private GLDrawable getBgDrawable(int i)
    {
        if (i == 3 || i == 2 || i == 4)
        {
            return mDayBg;
        }
        if (i == 9 || i == 10)
        {
            return mNightBg;
        } else
        {
            return mRainyBg;
        }
    }

    private int getNextCityIndex()
    {
        return (mCur + 1) % mCityCount;
    }

    private int getPreCItyIndex()
    {
        return ((mCur - 1) + mCityCount) % mCityCount;
    }

    private float getYfX(float f)
    {
        return -(float)Math.pow(2D, -f);
    }

    private void init(Context context)
    {
        mContext = context;
        setOnLongClickListener(this);
        setOnClickListener(new com.gtp.nextlauncher.widget.nextpanel.h(this));
        mNA = e.a().M(context);
        mLeftDrawable = e.a().a(mContext);
        mRightDrawable = e.a().b(mContext);
        mUpDrawable = e.a().c(mContext);
        mDownDrawable = e.a().d(mContext);
        mFloor = new Floor(mContext);
        addView(mFloor, new com.go.gl.view.GLRelativeLayout.LayoutParams(-1, -1));
        mNightBg = e.a().k(mContext);
        mDayBg = e.a().t(mContext);
        mRainyBg = e.a().g(mContext);
        mBgs.add(mRainyBg);
    }

    private void initBg(int i, int j)
    {
        mNightBg.setBounds(0, 0, i, j);
        mDayBg.setBounds(0, 0, i, j);
        mRainyBg.setBounds(0, 0, i, j);
    }

    private void initBgs()
    {
        mBgs.clear();
        for (int i = 0; i < mCityViewList.size(); i++)
        {
            GLDrawable gldrawable = getBgDrawable(((CityView)mCityViewList.get(i)).getWeatherType());
            mBgs.add(gldrawable);
        }

        if (mCityViewList.size() < 1)
        {
            GLDrawable gldrawable1 = mDayBg;
            mBgs.add(gldrawable1);
        }
    }

    private boolean isShowForecast()
    {
        if (mCityViewList != null)
        {
            CityView cityview = (CityView)mCityViewList.get(mCur);
            if (cityview != null)
            {
                return cityview.getIsFore();
            }
        }
        return false;
    }

    private void onChangeCity(float f)
    {
        float f1;
        if (f != 1.0F)
        {
            f1 = getInterpor(f);
        } else
        {
            f1 = f;
        }
        if (mToNextCity)
        {
            mOffX = -f1 * (float)mWidth * 3F;
        } else
        {
            mOffX = f1 * (float)(mWidth * 3);
        }
        mNextBgAlpha = f;
        if (f == 1.0F)
        {
            onChangeCityEnd();
        }
        invalidate();
    }

    private void onChangeCityEnd()
    {
        mIsInCityAnimation = false;
        ((CityView)mCityViewList.get(mCur)).clearWall();
        if (mToNextCity)
        {
            mCur = mDataHandler.g();
        } else
        {
            mCur = mDataHandler.h();
        }
        ((CityView)mCityViewList.get(mCur)).initWall();
        ((CityView)mCityViewList.get(mCur)).showWeatherDesp();
        mOffX = 0.0F;
        mNextBgAlpha = 0.0F;
        invalidate();
    }

    private void startChangeCity(boolean flag)
    {
        if (mIsInCityAnimation)
        {
            foreChangeCityEnd();
        }
        if (mCityViewList.size() < 2)
        {
            return;
        } else
        {
            mIsInCityAnimation = true;
            mChangeCityAnimationStartTime = -1L;
            mToNextCity = flag;
            initBgs();
            invalidate();
            return;
        }
    }

    private void startShowForecast()
    {
        if (mIsInCityAnimation || mCityViewList.size() < 1)
        {
            return;
        } else
        {
            ((CityView)mCityViewList.get(mCur)).startForecast();
            return;
        }
    }

    private void startWeatherActivity()
    {
        Object obj = "";
        int i;
        if (mDataHandler.i() > 0)
        {
            obj = mDataHandler.k();
            i = mDataHandler.l();
        } else
        {
            i = -1;
        }
        obj = p.a(getContext(), ((String) (obj)), true, 18, "", -1);
        ((Intent) (obj)).addFlags(0x4000000);
        ((Intent) (obj)).putExtra("gowidget_Id", mWidgetID);
        ((Intent) (obj)).putExtra("isMyLocation", i);
        getContext().startActivity(((Intent) (obj)));
    }

    public void cleanup()
    {
        mIsLive = false;
        super.cleanup();
    }

    public void closeFullScreenAnimation(int i)
    {
        if (mCityViewList != null && mCityViewList.size() > 0)
        {
            CityView cityview = (CityView)mCityViewList.get(mCur);
            if (cityview != null)
            {
                cityview.forceClosePreviewAnimation();
            }
        }
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        if (mChangeCityAnimationStartTime == -1L)
        {
            mChangeCityAnimationStartTime = getDrawingTime();
        }
        float f = Math.max(0.0F, Math.min((float)(getDrawingTime() - mChangeCityAnimationStartTime) / 500F, 1.0F));
        if (mIsInCityAnimation)
        {
            onChangeCity(f);
        }
        int i = glcanvas.save();
        glcanvas.clipRect(sClickRect);
        drawBg(glcanvas);
        mFloor.draw(glcanvas);
        glcanvas.restoreToCount(i);
        if (!mIsLive || mCityViewList.size() < 1)
        {
            mNA.draw(glcanvas);
            return;
        }
        i = glcanvas.save();
        glcanvas.translate(mOffX, 0.0F);
        if (mCur == -1)
        {
            mCur = 0;
        }
        ((CityView)mCityViewList.get(mCur)).setOffSet(mOffX);
        ((CityView)mCityViewList.get(mCur)).draw(glcanvas);
        glcanvas.restoreToCount(i);
        i = glcanvas.save();
        if (mIsInCityAnimation)
        {
            if (mToNextCity)
            {
                glcanvas.translate(mOffX + (float)(mWidth * 3), 0.0F);
                CityView cityview = (CityView)mCityViewList.get(getNextCityIndex());
                cityview.setOffSet(mOffX + (float)(mWidth * 3));
                cityview.draw(glcanvas);
            } else
            {
                glcanvas.translate(mOffX - (float)(mWidth * 3), 0.0F);
                CityView cityview1 = (CityView)mCityViewList.get(getPreCItyIndex());
                cityview1.setOffSet(mOffX - (float)(mWidth * 3));
                cityview1.draw(glcanvas);
            }
        }
        glcanvas.restoreToCount(i);
        i = glcanvas.getAlpha();
        if (mCityCount > 1)
        {
            glcanvas.setAlpha((int)((float)i * mLeftAlpha));
            mLeftDrawable.draw(glcanvas);
            glcanvas.setAlpha((int)((float)i * mRightAlpha));
            mRightDrawable.draw(glcanvas);
        }
        glcanvas.setAlpha((int)((float)i * mBottomAlpha));
        if (isShowForecast())
        {
            mUpDrawable.draw(glcanvas);
        } else
        {
            mDownDrawable.draw(glcanvas);
        }
        glcanvas.setAlpha(i);
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        f = motionevent.getX();
        f1 = motionevent.getY();
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 44
    //                   0 52
    //                   1 151
    //                   2 84
    //                   3 298;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        super.dispatchTouchEvent(motionevent);
        return true;
_L2:
        mDownX = f;
        mDownY = f1;
        checkFoucus((int)mDownX, (int)mDownY);
        mHasMove = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (Math.abs(mDownY - f1) > mStartForeD)
        {
            if (mCur == 0)
            {
                mDownY = f1;
            } else
            {
                mDownY = f1;
            }
            mHasMove = true;
        }
        if (Math.abs(mDownX - f) > mStartForeD)
        {
            mHasMove = true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        clearFoucus();
        if (mLeftRect.contains((int)f, (int)f1) && mLeftRect.contains((int)mDownX, (int)mDownY) && !mHasMove)
        {
            startChangeCity(false);
            return false;
        }
        if (mRightRect.contains((int)f, (int)f1) && mRightRect.contains((int)mDownX, (int)mDownY) && !mHasMove)
        {
            startChangeCity(true);
            return false;
        }
        if (mUpRect.contains((int)f, (int)f1) && mUpRect.contains((int)mDownX, (int)mDownY) && !mHasMove)
        {
            startShowForecast();
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        clearFoucus();
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void endRefresh()
    {
    }

    public void fullScreenFloatAnimation(GLCanvas glcanvas)
    {
        if (mCityViewList != null && mCityViewList.size() > 0)
        {
            CityView cityview = (CityView)mCityViewList.get(mCur);
            if (cityview != null)
            {
                cityview.drawFlyingFrame(glcanvas);
            }
        }
    }

    public GLView getContentView()
    {
        return this;
    }

    public float getInterpor(float f)
    {
        f = getYfX((float)(mXmax - mXmin) * f + (float)mXmin);
        float f1 = getYfX(mXmax);
        float f2 = getYfX(mXmin);
        return (f - f2) / (f1 - f2);
    }

    public float getPanelVersion()
    {
        return 2.0F;
    }

    public int getVersion()
    {
        return 0;
    }

    public boolean onActivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public boolean onApplyTheme(Bundle bundle)
    {
        return false;
    }

    public void onAutoLocateFail(String s)
    {
        for (int i = 0; i < mCityViewList.size(); i++)
        {
            ((CityView)mCityViewList.get(i)).showWeatherDesp();
            ((CityView)mCityViewList.get(i)).invalidate();
        }

    }

    public void onClearMemory()
    {
    }

    public void onDateStyleChange(int i)
    {
    }

    public boolean onDeactivate(boolean flag, Bundle bundle)
    {
        return false;
    }

    public void onDelete()
    {
        mDataHandler.a(mWidgetID);
    }

    public void onEnter()
    {
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
    }

    public void onLeave()
    {
    }

    public void onLoadFinish()
    {
        mCityCount = mDataHandler.i();
        int i;
        if (mCityViewList != null)
        {
            i = mCityViewList.size();
        } else
        {
            i = 0;
        }
        if (i < mCityCount)
        {
            for (; i < mCityCount; i++)
            {
                CityView cityview = new CityView(mContext);
                addView(cityview, new com.go.gl.view.GLRelativeLayout.LayoutParams(-1, -1));
                mCityViewList.add(cityview);
            }

        } else
        if (i > mCityCount)
        {
            for (i--; i >= mCityCount; i--)
            {
                removeView((CityView)mCityViewList.remove(i));
            }

        }
        mCur = mDataHandler.j();
        if (mCur == -1)
        {
            mCur = 0;
        }
        for (int j = 0; j < mCityCount; j++)
        {
            int k = mDataHandler.b(j).l.d();
            ((CityView)mCityViewList.get(j)).setDateHandler(mDataHandler, j, k);
        }

        if (mCityCount < 1)
        {
            CityView cityview1 = new CityView(mContext);
            addView(cityview1, new com.go.gl.view.GLRelativeLayout.LayoutParams(-1, -1));
            mCityViewList.add(cityview1);
            ((CityView)mCityViewList.get(0)).setDateHandler(mDataHandler, 0, 6);
            mCur = 0;
        }
        if (mCityViewList != null && mCityViewList.size() > 0)
        {
            CityView cityview2 = (CityView)mCityViewList.get(mCur);
            if (cityview2 != null)
            {
                cityview2.initWall();
            }
        }
        initBgs();
        mCur = Math.min(mCur, mCityViewList.size());
    }

    public boolean onLongClick(GLView glview)
    {
        performLongClick();
        return false;
    }

    public void onRemove()
    {
        mDataHandler.e();
        e.a().b();
    }

    public void onScreenChange(String s)
    {
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        int i1 = mLeftDrawable.getIntrinsicWidth();
        l = mLeftDrawable.getIntrinsicHeight();
        k = (j - l) / 2;
        l += k;
        mLeftDrawable.setBounds(0, k, i1, l);
        mLeftRect.set(0, k, i1 * 2, l);
        i1 = mRightDrawable.getIntrinsicWidth();
        mRightDrawable.getIntrinsicHeight();
        int j1 = i - i1;
        mRightDrawable.setBounds(j1, k, i, l);
        mRightRect.set(j1 - i1, k, i, l);
        k = mUpDrawable.getIntrinsicWidth();
        l = mUpDrawable.getIntrinsicHeight();
        i1 = (i - k) / 2;
        j1 = i1 + k;
        int k1 = j - l - 20;
        int l1 = j - 20;
        mUpDrawable.setBounds(i1, k1, j1, l1);
        mUpRect.set(i1 - k, k1 - l, k + j1, l1);
        mDownDrawable.setBounds(i1, k1, j1, l1);
        initBg(i, j);
        sClickRect.set(0, 0, i, j);
        k = mNA.getIntrinsicWidth();
        l = mNA.getIntrinsicHeight();
        i = (i - k) / 2;
        j = (j - l) / 2;
        mNA.setBounds(i, j, k + i, l + j);
    }

    public void onStart(Bundle bundle)
    {
        mWidgetID = bundle.getInt("gowidget_Id");
        if (mDataHandler == null)
        {
            mDataHandler = new e(mContext, mWidgetID, this, true);
            mDataHandler.a(this);
        }
        mIsLive = true;
    }

    public void onStop()
    {
    }

    public void onTemperatureUnitChange(int i)
    {
        Iterator iterator = mCityViewList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            CityView cityview = (CityView)iterator.next();
            if (cityview != null)
            {
                cityview.updateTemp();
            }
        } while (true);
    }

    public void onTimeChange(int i, int j)
    {
        if (mCityViewList != null && mCityViewList.size() > 0)
        {
            CityView cityview = (CityView)mCityViewList.get(mCur);
            if (cityview != null)
            {
                cityview.onTimeChange();
            }
        }
        initBgs();
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        super.setDrawingCacheEnabled(flag);
    }

    public void setWidgetCallback(WidgetCallback widgetcallback)
    {
    }

    public void startFullScreenAnimation(int i, Bundle bundle)
    {
    }

    public void startFullScreenAnimation(int i, Bundle bundle, FullScreenNextWidgetCallback fullscreennextwidgetcallback)
    {
        float f = 0.0F;
        mFullScreenNextWidgetCallback = fullscreennextwidgetcallback;
        if (bundle != null)
        {
            f = bundle.getFloat("scene_angle");
            mCorner = bundle.getFloatArray("upper_left_corner");
        }
        if (mCityViewList != null && mCityViewList.size() > 0)
        {
            bundle = (CityView)mCityViewList.get(mCur);
            if (bundle != null)
            {
                if (i == 0)
                {
                    bundle.startRiseAnimation(f, mCorner, fullscreennextwidgetcallback);
                    if (mFullScreenNextWidgetCallback != null)
                    {
                        mFullScreenNextWidgetCallback.onFullAnimationStart();
                    }
                } else
                if (i == 1)
                {
                    bundle.startWeatherAnimation();
                    return;
                }
            }
        }
    }

    public void startRefresh()
    {
    }

    public void switchToModel(int i)
    {
        if (i == 0)
        {
            if (mCityViewList != null && mCityViewList.size() > 0)
            {
                CityView cityview = (CityView)mCityViewList.get(mCur);
                if (cityview != null)
                {
                    cityview.forceClosePreviewAnimation();
                    cityview.onEnterPreview();
                }
            }
        } else
        if (1 == i)
        {
            return;
        }
    }












}
