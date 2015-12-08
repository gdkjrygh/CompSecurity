.class public final Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/MaskedWalletRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Builder"
.end annotation


# instance fields
.field final synthetic zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/MaskedWalletRequest;)V
    .locals 0

    .prologue
    iput-object p1, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/MaskedWalletRequest;Lcom/google/android/gms/wallet/MaskedWalletRequest$1;)V
    .locals 0
    .param p1, "x0"    # Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .param p2, "x1"    # Lcom/google/android/gms/wallet/MaskedWalletRequest$1;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;-><init>(Lcom/google/android/gms/wallet/MaskedWalletRequest;)V

    return-void
.end method


# virtual methods
.method public addAllowedCardNetwork(I)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 2
    .param p1, "allowedCardNetwork"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRu:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRu:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRu:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addAllowedCardNetworks(Ljava/util/Collection;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;"
        }
    .end annotation

    .prologue
    .local p1, "allowedCardNetworks":Ljava/util/Collection;, "Ljava/util/Collection<Ljava/lang/Integer;>;"
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRu:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRu:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRu:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-object p0
.end method

.method public addAllowedCountrySpecificationForShipping(Lcom/google/android/gms/identity/intents/model/CountrySpecification;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 2
    .param p1, "countrySpecification"    # Lcom/google/android/gms/identity/intents/model/CountrySpecification;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRs:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRs:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public addAllowedCountrySpecificationsForShipping(Ljava/util/Collection;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/identity/intents/model/CountrySpecification;",
            ">;)",
            "Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;"
        }
    .end annotation

    .prologue
    .local p1, "countrySpecifications":Ljava/util/Collection;, "Ljava/util/Collection<Lcom/google/android/gms/identity/intents/model/CountrySpecification;>;"
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRs:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRs:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_1
    return-object p0
.end method

.method public build()Lcom/google/android/gms/wallet/MaskedWalletRequest;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    return-object v0
.end method

.method public setAllowDebitCard(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "allowDebitCard"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRr:Z

    return-object p0
.end method

.method public setAllowPrepaidCard(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "allowPrepaidCard"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRq:Z

    return-object p0
.end method

.method public setCart(Lcom/google/android/gms/wallet/Cart;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "cart"    # Lcom/google/android/gms/wallet/Cart;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaQx:Lcom/google/android/gms/wallet/Cart;

    return-object p0
.end method

.method public setCurrencyCode(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "currencyCode"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaQg:Ljava/lang/String;

    return-object p0
.end method

.method public setEstimatedTotalPrice(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "estimatedTotalPrice"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRl:Ljava/lang/String;

    return-object p0
.end method

.method public setIsBillingAgreement(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "isBillingAgreement"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRo:Z

    return-object p0
.end method

.method public setMerchantName(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "merchantName"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRm:Ljava/lang/String;

    return-object p0
.end method

.method public setMerchantTransactionId(Ljava/lang/String;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "merchantTransactionId"    # Ljava/lang/String;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaQn:Ljava/lang/String;

    return-object p0
.end method

.method public setPaymentMethodTokenizationParameters(Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "paymentMethodTokenizationParameters"    # Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRt:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    return-object p0
.end method

.method public setPhoneNumberRequired(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "phoneNumberRequired"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRi:Z

    return-object p0
.end method

.method public setShippingAddressRequired(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "shippingAddressRequired"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRj:Z

    return-object p0
.end method

.method public setShouldRetrieveWalletObjects(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "shouldRetrieveWalletObjects"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRn:Z

    return-object p0
.end method

.method public setUseMinimalBillingAddress(Z)Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;
    .locals 1
    .param p1, "useMinimalBillingAddress"    # Z

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/wallet/MaskedWalletRequest$Builder;->zzaRv:Lcom/google/android/gms/wallet/MaskedWalletRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/MaskedWalletRequest;->zzaRk:Z

    return-object p0
.end method
