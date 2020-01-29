
package frc.robot.subsystems;

//import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.networktables.NetworkTable;
//import edu.wpi.first.networktables.NetworkTableEntry;
//import edu.wpi.first.networktables.NetworkTableInstance;
//import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
//import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
//import frc.robot.OI;


 
 // public class LimeLight {

    
        //private NetworkTable m_table;
        //private String m_tableName;
        
        // m_tableName = "limelight";
           //m_table = NetworkTableInstance.getDefault().getTable(m_tableName);
       //}
  
        //public LimeLight(String tableName) {
           // m_tableName = tableName;
          //  m_table = NetworkTableInstance.getDefault().getTable(m_tableName);
       // }
    
       
        //public LimeLight(NetworkTable table) {
          //  m_table = table;
            //ToDo
            //m_tableName = get the name of the NT key.
       // }
        
       // public void LimeLightInit() {
      //      //testAllTab();
      //  }
        
    
        /**
         * tv   Whether the limelight has any valid targets (0 or 1)
         * @return
         */
       /** 
        * public boolean getIsTargetFound() {
            NetworkTableEntry tv = m_table.getEntry("tv");
            double v = tv.getDouble(0);
            if (v == 0.0f){
                return false;
            }else {
                return true;
            }
        }
        /**
         * tx Horizontal Offset From Crosshair To Target (-27 degrees to 27 degrees)
         * @return
         *
        public double getdegRotationToTarget() {
            NetworkTableEntry tx = m_table.getEntry("tx");
            double x = tx.getDouble(0.0);
            return x;
        }
        /**
         * ty Vertical Offset From Crosshair To Target (-20.5 degrees to 20.5 degrees)
         * @return 
         *
        public double getdegVerticalToTarget() {
            NetworkTableEntry ty = m_table.getEntry("ty");
            double y = ty.getDouble(0.0);
            return y;
        }
        /**
         * ta Target Area (0% of image to 100% of image)
         * @return
         *
        public double getTargetArea() {
            NetworkTableEntry ta = m_table.getEntry("ta");
            double a = ta.getDouble(0.0);
            return a;
        }
        /**
         * ts Skew or rotation (-90 degrees to 0 degrees)
         * @return
         *
        public double getSkew_Rotation() {
            NetworkTableEntry ts = m_table.getEntry("ts");
            double s = ts.getDouble(0.0);
            return s;
        }
        /**
         * tl The pipeline’s latency contribution (ms) Add at least 11ms for image capture latency.
         * @return
         *
        public double getPipelineLatency() {
            NetworkTableEntry tl = m_table.getEntry("tl");
            double l = tl.getDouble(0.0);
            return l;
        }
    
        
    
        /**
         * pipeline Sets limelight’s current pipeline
         * 
         * 0 . 9	Select pipeline 0.9
         * 
         * @param pipeline
         */
        /* public void setPipeline(Double pipeline) {
            if(pipeline<0){
                pipeline = 0.0;
                throw new IllegalArgumentException("Pipeline can not be less than zero");
            }else if(pipeline>9){
                pipeline = 9.0;
                throw new IllegalArgumentException("Pipeline can not be greater than nine");
            }
            m_table.getEntry("pipeline").setValue(pipeline);
        } */
    
         /**
         * pipeline Sets limelight’s current pipeline
         * 
         * 0 . 9	Select pipeline 0.9
         * 
         * @param pipeline
         *
        public void setPipeline(Integer pipeline) {
            if(pipeline<0){
                pipeline = 0;
                throw new IllegalArgumentException("Pipeline can not be less than zero");
            }else if(pipeline>9){
                pipeline = 9;
                throw new IllegalArgumentException("Pipeline can not be greater than nine");
            }
            m_table.getEntry("pipeline").setValue(pipeline);
        }
    
        /**
         * Returns current Pipeling of the Lime Light
         * @return Pipelinge
         *
        public double getPipeline(){
            NetworkTableEntry pipeline = m_table.getEntry("pipeline");
            double pipe = pipeline.getDouble(0.0);
            return pipe;
        }
    
        /**
         * Returns current Pipeling of the Lime Light
         * @return Pipelinge
         *
        public Integer getPipelineInt(){
            NetworkTableEntry pipeline = m_table.getEntry("pipeline");
            Integer pipe = (int) pipeline.getDouble(0.0);
            return pipe;
        }
    
        /**
         * stream   Sets limelight’s streaming mode
         * 
         * kStandard - Side-by-side streams if a webcam is attached to Limelight
         * kPiPMain - The secondary camera stream is placed in the lower-right corner of the primary camera stream
         * kPiPSecondary - The primary camera stream is placed in the lower-right corner of the secondary camera stream
         * 
         * @param stream
         */ 
//}
