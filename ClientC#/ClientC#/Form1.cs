using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void GetCars_Click(object sender, EventArgs e)
        {
            WindowsFormsApp2.ServiceReference1.WSInterfacePortTypeClient client = new WindowsFormsApp2.ServiceReference1.WSInterfacePortTypeClient();
            string s = client.getCars();

            string[] s2 = s.Split(new[] { ", " }, StringSplitOptions.None);

            for(int i = 0; i < s2.Length; i++)
            {
                carsLabel.Text += s2[i] + " ";
                if(i%3 == 0)
                {
                    carsLabel.Text += "\n";
                }
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            WindowsFormsApp2.ServiceReference1.WSInterfacePortTypeClient client = new WindowsFormsApp2.ServiceReference1.WSInterfacePortTypeClient();
        }
    }
}
