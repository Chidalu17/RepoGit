package com.example.repogit.databinding;
import com.example.repogit.R;
import com.example.repogit.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemListBindingImpl extends ItemListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.repoDescriptionItem.setTag(null);
        this.repoNameItem.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.repogit.ui.repo.RepoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.repogit.ui.repo.RepoViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelGetRepoTitleName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelGetRepoDescription((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelGetRepoTitleName(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelGetRepoTitleName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelGetRepoDescription(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelGetRepoDescription, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelGetRepoTitleName = null;
        java.lang.String viewModelGetRepoDescriptionGetValue = null;
        java.lang.String viewModelGetRepoTitleNameGetValue = null;
        com.example.repogit.ui.repo.RepoViewModel viewModel = mViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelGetRepoDescription = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getRepoTitleName()
                        viewModelGetRepoTitleName = viewModel.getRepoTitleName();
                    }
                    updateLiveDataRegistration(0, viewModelGetRepoTitleName);


                    if (viewModelGetRepoTitleName != null) {
                        // read viewModel.getRepoTitleName().getValue()
                        viewModelGetRepoTitleNameGetValue = viewModelGetRepoTitleName.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.getRepoDescription()
                        viewModelGetRepoDescription = viewModel.getRepoDescription();
                    }
                    updateLiveDataRegistration(1, viewModelGetRepoDescription);


                    if (viewModelGetRepoDescription != null) {
                        // read viewModel.getRepoDescription().getValue()
                        viewModelGetRepoDescriptionGetValue = viewModelGetRepoDescription.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.example.repogit.util.BindingAdapterKt.setMutableText(this.repoDescriptionItem, viewModelGetRepoDescription);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.example.repogit.util.BindingAdapterKt.setMutableText(this.repoNameItem, viewModelGetRepoTitleName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.getRepoTitleName()
        flag 1 (0x2L): viewModel.getRepoDescription()
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}