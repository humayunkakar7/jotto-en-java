//==============================================================================
// Jotto
//
// @description: Module for providing functions to work with IView interface
// @author: Humayun Khan
// @version: 1.0 --
//==============================================================================

public interface IView {
   
   // Updates the view
   // Note: This method is generally called by the model
   // whenever it has changed state.
   public void update();
}
