// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.kangaroo.Request;
import com.walmartlabs.kangaroo.service.Header;
import com.walmartlabs.kangaroo.service.Log;
import com.walmartlabs.kangaroo.service.RequestBuilder;
import com.walmartlabs.kangaroo.service.Service;
import com.walmartlabs.kangaroo.service.SharedHttpClient;
import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.payment.model.CreditCard;
import com.walmartlabs.payment.model.GiftCard;
import com.walmartlabs.payment.service.BaseResponse;
import com.walmartlabs.payment.service.JacksonConverter;
import com.walmartlabs.payment.service.payment.CreateUserRequest;
import com.walmartlabs.payment.service.payment.PairRequest;
import com.walmartlabs.payment.service.payment.PairResponse;
import com.walmartlabs.payment.service.payment.SetGiftCardsResponse;
import com.walmartlabs.payment.service.payment.Transaction;
import com.walmartlabs.payment.service.payment.UpdateTransactionRequest;
import com.walmartlabs.payment.service.payment.UserCardsResponse;
import com.walmartlabs.payment.service.payment.UserResponse;
import com.walmartlabs.payment.service.payment.UserTransactionResponse;
import com.walmartlabs.utils.WLog;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            CreditCards, GiftCardResponse, WireStatus, CardResponse, 
//            MetaHeader, CreditCardRequest, GiftCardRequest

public class CustomerService
{
    private static class CreditCardListTransformer
        implements Transformer
    {

        public CreditCard transform(CreditCards creditcards)
        {
            if (creditcards.data != null && creditcards.data.items != null && creditcards.data.items.length > 0)
            {
                CreditCard creditcard = creditcards.data.items[0];
                if (creditcards.hasClientErrorMessage())
                {
                    creditcard.error = creditcards.error;
                }
                return creditcard;
            }
            if (creditcards.hasClientErrorMessage())
            {
                CreditCard creditcard1 = new CreditCard();
                creditcard1.error = creditcards.error;
                return creditcard1;
            } else
            {
                return null;
            }
        }

        public volatile Object transform(Object obj)
        {
            return transform((CreditCards)obj);
        }

        private CreditCardListTransformer()
        {
        }

    }

    private static class GiftCardResponseTransformer
        implements Transformer
    {

        public GiftCard transform(GiftCardResponse giftcardresponse)
        {
            if (giftcardresponse.data != null && giftcardresponse.data.items != null && giftcardresponse.data.items.length > 0)
            {
                GiftCard giftcard = giftcardresponse.data.items[0];
                if (giftcardresponse.hasClientErrorMessage())
                {
                    giftcard.error = giftcardresponse.error;
                }
                return giftcard;
            }
            if (giftcardresponse.hasClientErrorMessage())
            {
                GiftCard giftcard1 = new GiftCard();
                giftcard1.error = giftcardresponse.error;
                return giftcard1;
            } else
            {
                return null;
            }
        }

        public volatile Object transform(Object obj)
        {
            return transform((GiftCardResponse)obj);
        }

        private GiftCardResponseTransformer()
        {
        }

    }

    private static class TokenTransformer
        implements Transformer
    {

        public volatile Object transform(Object obj)
        {
            return transform((PairResponse)obj);
        }

        public String transform(PairResponse pairresponse)
        {
            if (pairresponse.data != null && pairresponse.data.items != null && !pairresponse.data.items.isEmpty())
            {
                return ((com.walmartlabs.payment.service.payment.PairResponse.Token)pairresponse.data.items.get(0)).token;
            } else
            {
                return null;
            }
        }

        private TokenTransformer()
        {
        }

    }

    private static class TransactionTransformer
        implements Transformer
    {

        public Transaction transform(UserTransactionResponse usertransactionresponse)
        {
            int i = 0;
            if (usertransactionresponse.data != null && usertransactionresponse.data.related != null && usertransactionresponse.data.related.transactions != null && usertransactionresponse.data.related.transactions.items != null && usertransactionresponse.data.related.transactions.items.length > 0)
            {
                com.walmartlabs.payment.service.payment.UserTransactionResponse.Item item = usertransactionresponse.data.related.transactions.items[0];
                float f = 0.0F;
                float f1 = 0.0F;
                String s = "";
                usertransactionresponse = "";
                com.walmartlabs.payment.service.payment.UserTransactionResponse.Authorization aauthorization[] = item.authorizations;
                int j = aauthorization.length;
                while (i < j) 
                {
                    com.walmartlabs.payment.service.payment.UserTransactionResponse.Authorization authorization = aauthorization[i];
                    float f2 = f1;
                    UserTransactionResponse usertransactionresponse1 = usertransactionresponse;
                    float f3 = f;
                    String s1 = s;
                    if (authorization != null)
                    {
                        if ("giftCard".equals(authorization.type))
                        {
                            f3 = f + authorization.amount;
                            s1 = s;
                            usertransactionresponse1 = usertransactionresponse;
                            f2 = f1;
                        } else
                        {
                            f2 = f1;
                            usertransactionresponse1 = usertransactionresponse;
                            f3 = f;
                            s1 = s;
                            if ("creditCard".equals(authorization.type))
                            {
                                f2 = authorization.amount;
                                if (authorization.lastFour != null)
                                {
                                    s = authorization.lastFour;
                                }
                                if (authorization.cardType != null)
                                {
                                    usertransactionresponse = authorization.cardType;
                                }
                                usertransactionresponse1 = usertransactionresponse;
                                f3 = f;
                                s1 = s;
                            }
                        }
                    }
                    i++;
                    f1 = f2;
                    usertransactionresponse = usertransactionresponse1;
                    f = f3;
                    s = s1;
                }
                return (new com.walmartlabs.payment.service.payment.Transaction.Builder()).setTransactionTotal(item.amount).setDate(item.transactionDate).setGiftCardAmount(f).setCreditCardAmount(f1).setLastFour(s).setCreditCardType(usertransactionresponse).setStoreId(String.valueOf(item.storeId)).setId(item.id).setTc(item.tc).setClientSeen(item.clientSeen).setAddressLineOne(item.addressLineOne).build();
            } else
            {
                return null;
            }
        }

        public volatile Object transform(Object obj)
        {
            return transform((UserTransactionResponse)obj);
        }

        private TransactionTransformer()
        {
        }

    }


    private static final String HEADER_WPAY_META = "wpay-meta";
    public static final String MOBILE_PAY_HOST_DEV = "pay-stg2.edge.walmart.com";
    public static final String MOBILE_PAY_HOST_PROD = "pay.edge.walmart.com";
    public static final String MOBILE_PAY_HOST_QA = "pay-stg1.edge.walmart.com";
    public static final String PATH_ALL_CARDS = "customer/card";
    public static final String PATH_CREDIT_CARD = "customer/credit-card";
    public static final String PATH_GIFT_CARD = "customer/gift-card";
    public static final String PATH_PAIR_USER = "user/pair";
    public static final String PATH_USER = "user";
    public static final String PATH_USER_GIFT_CARDS = "user/gift-cards";
    public static final String PATH_USER_TRANSACTION = "user/transactions";
    public static final Map QUERY_RELATED_CARDS;
    public static final Map QUERY_RELATED_TRANSACTION;
    private static final String TAG = com/walmartlabs/payment/service/customer/CustomerService.getSimpleName();
    public static final String VERSION_1 = "v1/";
    private final JacksonConverter mConverter;
    private final String mHost;
    private final Service mService;

    public CustomerService(String s, ObjectMapper objectmapper, Log log)
    {
        mHost = s;
        mConverter = new JacksonConverter(objectmapper);
        mService = (new com.walmartlabs.kangaroo.service.Service.Builder()).secure(true).host(s).path("v1/").converter(mConverter).okHttpClient(SharedHttpClient.get()).log(log).build();
    }

    private Header createMetaHeader(MetaHeader metaheader)
    {
        try
        {
            metaheader = new Header("wpay-meta", mConverter.toString(metaheader));
        }
        // Misplaced declaration of an exception variable
        catch (MetaHeader metaheader)
        {
            WLog.e(TAG, "Failed to create meta header", metaheader);
            return null;
        }
        return metaheader;
    }

    public Request createCreditCard(CreditCardRequest creditcardrequest)
    {
        return mService.newRequest().appendPath("customer/credit-card").post(creditcardrequest, com/walmartlabs/payment/service/customer/CreditCards, new CreditCardListTransformer());
    }

    public Request createGiftCard(GiftCardRequest giftcardrequest)
    {
        return mService.newRequest().appendPath("customer/gift-card").post(giftcardrequest, com/walmartlabs/payment/service/customer/GiftCardResponse, new GiftCardResponseTransformer());
    }

    public Request createUser(CreateUserRequest createuserrequest)
    {
        return mService.newRequest().appendPath("user").post(createuserrequest, com/walmartlabs/payment/service/payment/UserResponse);
    }

    public Request deleteCreditCard(String s)
    {
        return mService.newRequest().appendPath("customer/credit-card").appendPath(s).delete(null, com/walmartlabs/payment/service/customer/WireStatus);
    }

    public Request deleteGiftCard(String s)
    {
        return mService.newRequest().appendPath("customer/gift-card").appendPath(s).delete(null, com/walmartlabs/payment/service/customer/WireStatus);
    }

    public Request getAllCards()
    {
        return mService.newRequest().appendPath("customer/card").get(com/walmartlabs/payment/service/customer/CardResponse);
    }

    public String getHost()
    {
        return mHost;
    }

    public Request getUserTransaction(MetaHeader metaheader)
    {
        RequestBuilder requestbuilder = mService.newRequest().appendPath("user").query(QUERY_RELATED_TRANSACTION);
        metaheader = createMetaHeader(metaheader);
        if (metaheader != null)
        {
            requestbuilder.header(metaheader);
        }
        return requestbuilder.get(com/walmartlabs/payment/service/payment/UserTransactionResponse, new TransactionTransformer());
    }

    public Request pairUser(PairRequest pairrequest, MetaHeader metaheader)
    {
        RequestBuilder requestbuilder = mService.newRequest().appendPath("user/pair");
        metaheader = createMetaHeader(metaheader);
        if (metaheader != null)
        {
            requestbuilder.header(metaheader);
        }
        return requestbuilder.post(pairrequest, com/walmartlabs/payment/service/payment/PairResponse, new TokenTransformer());
    }

    public Request seenUserTransaction(Transaction transaction)
    {
        UpdateTransactionRequest updatetransactionrequest = new UpdateTransactionRequest();
        updatetransactionrequest.clientSeen = true;
        return mService.newRequest().appendPath("user/transactions").appendPath(transaction.id).put(updatetransactionrequest, com/walmartlabs/payment/service/BaseResponse);
    }

    public Request setUserGiftCards(com.walmartlabs.payment.service.payment.SetGiftCardsRequest.GiftCardData agiftcarddata[])
    {
        return mService.newRequest().appendPath("user/gift-cards").post(agiftcarddata, com/walmartlabs/payment/service/payment/SetGiftCardsResponse);
    }

    public Request updateCreditCard(String s, CreditCardRequest creditcardrequest)
    {
        return mService.newRequest().appendPath("customer/credit-card").appendPath(s).put(creditcardrequest, com/walmartlabs/payment/service/customer/CreditCards, new CreditCardListTransformer());
    }

    public Request updateGiftCard(String s, GiftCardRequest giftcardrequest)
    {
        return mService.newRequest().appendPath("customer/gift-card").appendPath(s).put(giftcardrequest, com/walmartlabs/payment/model/GiftCard);
    }

    public Request user(MetaHeader metaheader)
    {
        RequestBuilder requestbuilder = mService.newRequest().appendPath("user");
        metaheader = createMetaHeader(metaheader);
        if (metaheader != null)
        {
            requestbuilder.header(metaheader);
        }
        return requestbuilder.get(com/walmartlabs/payment/service/payment/UserResponse);
    }

    public Request userCards(MetaHeader metaheader)
    {
        RequestBuilder requestbuilder = mService.newRequest().appendPath("user").query(QUERY_RELATED_CARDS);
        metaheader = createMetaHeader(metaheader);
        if (metaheader != null)
        {
            requestbuilder.header(metaheader);
        }
        return requestbuilder.get(com/walmartlabs/payment/service/payment/UserCardsResponse);
    }

    static 
    {
        QUERY_RELATED_CARDS = new HashMap();
        QUERY_RELATED_CARDS.put("related", "cards");
        QUERY_RELATED_TRANSACTION = new HashMap();
        QUERY_RELATED_TRANSACTION.put("related", "lastTransaction");
    }
}
