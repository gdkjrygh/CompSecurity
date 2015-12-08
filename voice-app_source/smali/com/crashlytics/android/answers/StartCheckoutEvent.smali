.class public Lcom/crashlytics/android/answers/StartCheckoutEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "StartCheckoutEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/StartCheckoutEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final CURRENCY_ATTRIBUTE:Ljava/lang/String; = "currency"

.field static final ITEM_COUNT_ATTRIBUTE:Ljava/lang/String; = "itemCount"

.field static final MICRO_CONSTANT:Ljava/math/BigDecimal;

.field static final TOTAL_PRICE_ATTRIBUTE:Ljava/lang/String; = "totalPrice"

.field static final TYPE:Ljava/lang/String; = "startCheckout"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 13
    const-wide/32 v0, 0xf4240

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/answers/StartCheckoutEvent;->MICRO_CONSTANT:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 9
    invoke-direct {p0}, Lcom/crashlytics/android/answers/PredefinedEvent;-><init>()V

    return-void
.end method


# virtual methods
.method getPredefinedType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 62
    const-string v0, "startCheckout"

    return-object v0
.end method

.method priceToMicros(Ljava/math/BigDecimal;)J
    .locals 2
    .param p1, "decimal"    # Ljava/math/BigDecimal;

    .prologue
    .line 57
    sget-object v0, Lcom/crashlytics/android/answers/StartCheckoutEvent;->MICRO_CONSTANT:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public putCurrency(Ljava/util/Currency;)Lcom/crashlytics/android/answers/StartCheckoutEvent;
    .locals 3
    .param p1, "currency"    # Ljava/util/Currency;

    .prologue
    .line 50
    iget-object v0, p0, Lcom/crashlytics/android/answers/StartCheckoutEvent;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "currency"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 51
    iget-object v0, p0, Lcom/crashlytics/android/answers/StartCheckoutEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "currency"

    invoke-virtual {p1}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    :cond_0
    return-object p0
.end method

.method public putItemCount(I)Lcom/crashlytics/android/answers/StartCheckoutEvent;
    .locals 3
    .param p1, "itemCount"    # I

    .prologue
    .line 26
    iget-object v0, p0, Lcom/crashlytics/android/answers/StartCheckoutEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemCount"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/Number;)V

    .line 27
    return-object p0
.end method

.method public putTotalPrice(Ljava/math/BigDecimal;)Lcom/crashlytics/android/answers/StartCheckoutEvent;
    .locals 4
    .param p1, "totalPrice"    # Ljava/math/BigDecimal;

    .prologue
    .line 37
    iget-object v0, p0, Lcom/crashlytics/android/answers/StartCheckoutEvent;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "totalPrice"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 38
    iget-object v0, p0, Lcom/crashlytics/android/answers/StartCheckoutEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "totalPrice"

    invoke-virtual {p0, p1}, Lcom/crashlytics/android/answers/StartCheckoutEvent;->priceToMicros(Ljava/math/BigDecimal;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/Number;)V

    .line 40
    :cond_0
    return-object p0
.end method
