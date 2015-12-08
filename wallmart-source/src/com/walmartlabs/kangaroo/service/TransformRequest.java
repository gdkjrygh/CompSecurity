// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import com.walmartlabs.kangaroo.Callback;
import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.Result;

// Referenced classes of package com.walmartlabs.kangaroo.service:
//            ExecutableRequest, Transformer

class TransformRequest extends ExecutableRequest
{
    public static class TransformException extends Exception
    {

        public TransformException()
        {
            super("Failed to transform");
        }
    }


    private final ExecutableRequest mRequest;
    private final Transformer mTransformer;

    public TransformRequest(ExecutableRequest executablerequest, Transformer transformer)
    {
        mRequest = executablerequest;
        mTransformer = transformer;
    }

    public TransformRequest(TransformRequest transformrequest)
    {
        super(transformrequest);
        mRequest = transformrequest.mRequest.copy();
        mTransformer = transformrequest.mTransformer;
    }

    private com.walmartlabs.kangaroo.Result.Builder copyResult(Result result)
    {
        return (new com.walmartlabs.kangaroo.Result.Builder()).code(result.getStatusCode()).headers(result.getHeaders()).responseType(result.getResponseType()).error(result.getError(), result.getException()).setRedirect(result.wasRedirected());
    }

    protected ExecutableRequest copy()
    {
        return new TransformRequest(this);
    }

    Request execute()
    {
        mRequest.execute().addCallback(new Callback() {

            final TransformRequest this$0;

            public void onCancelled(Request request)
            {
                cancel();
            }

            public void onResult(Request request, Result result)
            {
                request = copyResult(result);
                if (result.hasData())
                {
                    result = ((Result) (mTransformer.transform(result.getData())));
                    if (result != null)
                    {
                        request.data(result);
                    } else
                    {
                        request.error(com.walmartlabs.kangaroo.Result.Error.ERROR_UNEXPECTED_RESPONSE, new TransformException());
                    }
                }
                setAndNotifyResult(request.build());
            }

            
            {
                this$0 = TransformRequest.this;
                super();
            }
        });
        return this;
    }


}
