.class public Lcom/crashlytics/android/answers/PurchaseEvent;
.super Lcom/crashlytics/android/answers/PredefinedEvent;
.source "PurchaseEvent.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/crashlytics/android/answers/PredefinedEvent",
        "<",
        "Lcom/crashlytics/android/answers/PurchaseEvent;",
        ">;"
    }
.end annotation


# static fields
.field static final CURRENCY_ATTRIBUTE:Ljava/lang/String; = "currency"

.field static final ITEM_ID_ATTRIBUTE:Ljava/lang/String; = "itemId"

.field static final ITEM_NAME_ATTRIBUTE:Ljava/lang/String; = "itemName"

.field static final ITEM_PRICE_ATTRIBUTE:Ljava/lang/String; = "itemPrice"

.field static final ITEM_TYPE_ATTRIBUTE:Ljava/lang/String; = "itemType"

.field static final MICRO_CONSTANT:Ljava/math/BigDecimal;

.field static final SUCCESS_ATTRIBUTE:Ljava/lang/String; = "success"

.field static final TYPE:Ljava/lang/String; = "purchase"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 29
    const-wide/32 v0, 0xf4240

    invoke-static {v0, v1}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lcom/crashlytics/android/answers/PurchaseEvent;->MICRO_CONSTANT:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Lcom/crashlytics/android/answers/PredefinedEvent;-><init>()V

    return-void
.end method


# virtual methods
.method getPredefinedType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 115
    const-string v0, "purchase"

    return-object v0
.end method

.method priceToMicros(Ljava/math/BigDecimal;)J
    .locals 2
    .param p1, "decimal"    # Ljava/math/BigDecimal;

    .prologue
    .line 110
    sget-object v0, Lcom/crashlytics/android/answers/PurchaseEvent;->MICRO_CONSTANT:Ljava/math/BigDecimal;

    invoke-virtual {v0, p1}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object v0

    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method public putCurrency(Ljava/util/Currency;)Lcom/crashlytics/android/answers/PurchaseEvent;
    .locals 3
    .param p1, "currency"    # Ljava/util/Currency;

    .prologue
    .line 91
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "currency"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 92
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "currency"

    invoke-virtual {p1}, Ljava/util/Currency;->getCurrencyCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    :cond_0
    return-object p0
.end method

.method public putItemId(Ljava/lang/String;)Lcom/crashlytics/android/answers/PurchaseEvent;
    .locals 2
    .param p1, "itemId"    # Ljava/lang/String;

    .prologue
    .line 45
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemId"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    return-object p0
.end method

.method public putItemName(Ljava/lang/String;)Lcom/crashlytics/android/answers/PurchaseEvent;
    .locals 2
    .param p1, "itemName"    # Ljava/lang/String;

    .prologue
    .line 56
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemName"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 57
    return-object p0
.end method

.method public putItemPrice(Ljava/math/BigDecimal;)Lcom/crashlytics/android/answers/PurchaseEvent;
    .locals 4
    .param p1, "itemPrice"    # Ljava/math/BigDecimal;

    .prologue
    .line 78
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->validator:Lcom/crashlytics/android/answers/AnswersEventValidator;

    const-string v1, "itemPrice"

    invoke-virtual {v0, p1, v1}, Lcom/crashlytics/android/answers/AnswersEventValidator;->isNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemPrice"

    invoke-virtual {p0, p1}, Lcom/crashlytics/android/answers/PurchaseEvent;->priceToMicros(Ljava/math/BigDecimal;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/Number;)V

    .line 81
    :cond_0
    return-object p0
.end method

.method public putItemType(Ljava/lang/String;)Lcom/crashlytics/android/answers/PurchaseEvent;
    .locals 2
    .param p1, "itemType"    # Ljava/lang/String;

    .prologue
    .line 67
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "itemType"

    invoke-virtual {v0, v1, p1}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    return-object p0
.end method

.method public putSuccess(Z)Lcom/crashlytics/android/answers/PurchaseEvent;
    .locals 3
    .param p1, "purchaseSucceeded"    # Z

    .prologue
    .line 105
    iget-object v0, p0, Lcom/crashlytics/android/answers/PurchaseEvent;->predefinedAttributes:Lcom/crashlytics/android/answers/AnswersAttributes;

    const-string v1, "success"

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/crashlytics/android/answers/AnswersAttributes;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    return-object p0
.end method
