.class public Lcom/google/android/gms/appindexing/Thing$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/appindexing/Thing;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field final zzNW:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/appindexing/Thing$Builder;->zzNW:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public build()Lcom/google/android/gms/appindexing/Thing;
    .locals 2

    new-instance v0, Lcom/google/android/gms/appindexing/Thing;

    iget-object v1, p0, Lcom/google/android/gms/appindexing/Thing$Builder;->zzNW:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Lcom/google/android/gms/appindexing/Thing;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public put(Ljava/lang/String;Lcom/google/android/gms/appindexing/Thing;)Lcom/google/android/gms/appindexing/Thing$Builder;
    .locals 2
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Lcom/google/android/gms/appindexing/Thing;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/appindexing/Thing$Builder;->zzNW:Landroid/os/Bundle;

    iget-object v1, p2, Lcom/google/android/gms/appindexing/Thing;->zzNV:Landroid/os/Bundle;

    invoke-virtual {v0, p1, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :cond_0
    return-object p0
.end method

.method public put(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;
    .locals 1
    .param p1, "key"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/appindexing/Thing$Builder;->zzNW:Landroid/os/Bundle;

    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method public setDescription(Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;
    .locals 1
    .param p1, "description"    # Ljava/lang/String;

    .prologue
    const-string v0, "description"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/appindexing/Thing$Builder;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;

    return-object p0
.end method

.method public setId(Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;
    .locals 1
    .param p1, "id"    # Ljava/lang/String;

    .prologue
    if-eqz p1, :cond_0

    const-string v0, "id"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/appindexing/Thing$Builder;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;

    :cond_0
    return-object p0
.end method

.method public setName(Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "name"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/appindexing/Thing$Builder;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;

    return-object p0
.end method

.method public setType(Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;
    .locals 1
    .param p1, "type"    # Ljava/lang/String;

    .prologue
    const-string v0, "type"

    invoke-virtual {p0, v0, p1}, Lcom/google/android/gms/appindexing/Thing$Builder;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;

    return-object p0
.end method

.method public setUrl(Landroid/net/Uri;)Lcom/google/android/gms/appindexing/Thing$Builder;
    .locals 2
    .param p1, "url"    # Landroid/net/Uri;

    .prologue
    invoke-static {p1}, Lcom/google/android/gms/common/internal/zzu;->zzu(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "url"

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/google/android/gms/appindexing/Thing$Builder;->put(Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/appindexing/Thing$Builder;

    return-object p0
.end method
