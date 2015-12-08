.class public final Lcom/google/android/gms/drive/MetadataBuffer;
.super Lcom/google/android/gms/common/data/AbstractDataBuffer;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/MetadataBuffer$zza;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/data/AbstractDataBuffer",
        "<",
        "Lcom/google/android/gms/drive/Metadata;",
        ">;"
    }
.end annotation


# instance fields
.field private zzadq:Lcom/google/android/gms/drive/MetadataBuffer$zza;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/data/DataHolder;)V
    .locals 2
    .param p1, "dataHolder"    # Lcom/google/android/gms/common/data/DataHolder;

    .prologue
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/data/AbstractDataBuffer;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    invoke-virtual {p1}, Lcom/google/android/gms/common/data/DataHolder;->zznb()Landroid/os/Bundle;

    move-result-object v0

    const-class v1, Lcom/google/android/gms/drive/MetadataBuffer;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    return-void
.end method


# virtual methods
.method public get(I)Lcom/google/android/gms/drive/Metadata;
    .locals 2
    .param p1, "row"    # I

    .prologue
    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->zzadq:Lcom/google/android/gms/drive/MetadataBuffer$zza;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/drive/MetadataBuffer$zza;->zza(Lcom/google/android/gms/drive/MetadataBuffer$zza;)I

    move-result v1

    if-eq v1, p1, :cond_1

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/MetadataBuffer$zza;

    iget-object v1, p0, Lcom/google/android/gms/drive/MetadataBuffer;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/drive/MetadataBuffer$zza;-><init>(Lcom/google/android/gms/common/data/DataHolder;I)V

    iput-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->zzadq:Lcom/google/android/gms/drive/MetadataBuffer$zza;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 1
    .param p1, "x0"    # I

    .prologue
    invoke-virtual {p0, p1}, Lcom/google/android/gms/drive/MetadataBuffer;->get(I)Lcom/google/android/gms/drive/Metadata;

    move-result-object v0

    return-object v0
.end method

.method public getNextPageToken()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/MetadataBuffer;->zzWu:Lcom/google/android/gms/common/data/DataHolder;

    invoke-static {v0}, Lcom/google/android/gms/drive/metadata/internal/zze;->zzb(Lcom/google/android/gms/common/data/DataHolder;)V

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/common/data/AbstractDataBuffer;->release()V

    return-void
.end method
