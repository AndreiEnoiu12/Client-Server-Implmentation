namespace WindowsFormsApp2
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.GetCars = new System.Windows.Forms.Button();
            this.carsLabel = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // GetCars
            // 
            this.GetCars.Location = new System.Drawing.Point(42, 196);
            this.GetCars.Name = "GetCars";
            this.GetCars.Size = new System.Drawing.Size(185, 65);
            this.GetCars.TabIndex = 0;
            this.GetCars.Text = "Get Cars";
            this.GetCars.UseVisualStyleBackColor = true;
            this.GetCars.Click += new System.EventHandler(this.GetCars_Click);
            // 
            // carsLabel
            // 
            this.carsLabel.AutoSize = true;
            this.carsLabel.Location = new System.Drawing.Point(55, 50);
            this.carsLabel.Name = "carsLabel";
            this.carsLabel.Size = new System.Drawing.Size(0, 13);
            this.carsLabel.TabIndex = 1;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(278, 308);
            this.Controls.Add(this.carsLabel);
            this.Controls.Add(this.GetCars);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button GetCars;
        private System.Windows.Forms.Label carsLabel;
    }
}

