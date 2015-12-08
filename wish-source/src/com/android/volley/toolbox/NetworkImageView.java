// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//            ImageLoader

public class NetworkImageView extends ImageView
{

    private int mDefaultImageId;
    private int mErrorImageId;
    private ImageLoader.ImageContainer mImageContainer;
    private ImageLoader mImageLoader;
    private String mUrl;

    public NetworkImageView(Context context)
    {
        this(context, null);
    }

    public NetworkImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    private void setDefaultImageOrNull()
    {
        if (mDefaultImageId != 0)
        {
            setImageResource(mDefaultImageId);
            return;
        } else
        {
            setImageBitmap(null);
            return;
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        invalidate();
    }

    void loadImageIfNecessary(final boolean isInLayoutPass)
    {
        boolean flag;
        boolean flag1;
        int k;
        int l;
        l = getWidth();
        k = getHeight();
        flag1 = false;
        flag = false;
        boolean flag2;
        if (getLayoutParams() != null)
        {
            if (getLayoutParams().width == -2)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (getLayoutParams().height == -2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (flag1 && flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (l != 0 || k != 0 || flag2) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (TextUtils.isEmpty(mUrl))
        {
            if (mImageContainer != null)
            {
                mImageContainer.cancelRequest();
                mImageContainer = null;
            }
            setDefaultImageOrNull();
            return;
        }
        if (mImageContainer == null || mImageContainer.getRequestUrl() == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mImageContainer.getRequestUrl().equals(mUrl))
        {
            continue; /* Loop/switch isn't completed */
        }
        mImageContainer.cancelRequest();
        setDefaultImageOrNull();
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        int i;
        int j;
        if (flag1)
        {
            j = 0;
        } else
        {
            j = l;
        }
        if (flag)
        {
            i = 0;
        } else
        {
            i = k;
        }
        mImageContainer = mImageLoader.get(mUrl, new ImageLoader.ImageListener() {

            final NetworkImageView this$0;
            final boolean val$isInLayoutPass;

            public void onErrorResponse(VolleyError volleyerror)
            {
                if (mErrorImageId != 0)
                {
                    setImageResource(mErrorImageId);
                }
            }

            public void onResponse(ImageLoader.ImageContainer imagecontainer, boolean flag3)
            {
                if (flag3 && isInLayoutPass)
                {
                    post(imagecontainer. new Runnable() {

                        final _cls1 this$1;
                        final ImageLoader.ImageContainer val$response;

                        public void run()
                        {
                            onResponse(response, false);
                        }

            
            {
                this$1 = final__pcls1;
                response = ImageLoader.ImageContainer.this;
                super();
            }
                    });
                } else
                {
                    if (imagecontainer.getBitmap() != null)
                    {
                        setImageBitmap(imagecontainer.getBitmap());
                        return;
                    }
                    if (mDefaultImageId != 0)
                    {
                        setImageResource(mDefaultImageId);
                        return;
                    }
                }
            }

            
            {
                this$0 = NetworkImageView.this;
                isInLayoutPass = flag;
                super();
            }
        }, j, i);
        return;
    }

    protected void onDetachedFromWindow()
    {
        if (mImageContainer != null)
        {
            mImageContainer.cancelRequest();
            setImageBitmap(null);
            mImageContainer = null;
        }
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        loadImageIfNecessary(true);
    }

    public void setDefaultImageResId(int i)
    {
        mDefaultImageId = i;
    }

    public void setErrorImageResId(int i)
    {
        mErrorImageId = i;
    }

    public void setImageUrl(String s, ImageLoader imageloader)
    {
        mUrl = s;
        mImageLoader = imageloader;
        loadImageIfNecessary(false);
    }


}
