using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace NumeroCombinatorio
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            int n, x, result;
            n = Int16.Parse(txtN.Text);
            x = Int16.Parse(txtX.Text);
            result = combinatoria(n, x);
            lblResultado.Text = "El valor del número combinatorio es: " + result;
        }
        int factorial(int n)
        {
            if(n <= 1)
            {
                return 1;
            }
            else
            {
                return n * factorial(n - 1);
            }
            
        }
        int combinatoria(int n, int x)
        {
            return factorial(n) / (factorial(x) * factorial(n - x));
        }
    }
}
