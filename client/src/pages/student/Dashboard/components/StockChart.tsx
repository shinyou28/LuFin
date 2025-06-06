import React from 'react';
import { Doughnut } from 'react-chartjs-2';
import {
  Chart as ChartJS,
  Title,
  Tooltip,
  Legend,
  ArcElement,
  CategoryScale,
  LinearScale,
} from 'chart.js';
import cn from 'classnames';

ChartJS.register(Title, Tooltip, Legend, ArcElement, CategoryScale, LinearScale);

interface StockInfo {
  stock: string;
  amount: number;
}

interface stockChartProps {
  stocks: StockInfo[];
  className?: string;
}

const StockChart: React.FC<stockChartProps> = ({ stocks, className }) => {
  const data = {
    labels: stocks.map((stock) => stock.stock),
    datasets: [
      {
        data: stocks.map((stock) => stock.amount),
        backgroundColor: ['#C3EBFA', '#CFCEFF', '#FAE27C', '#FFDBF7', '#8785FF'],
        borderRadius: 4,
      },
    ],
  };

  const options = {
    responsive: true,
    maintainAspectRatio: true,
    aspectRatio: 3 / 2,
    cutout: '60%',
    plugins: {
      legend: {
        position: 'right' as const,
        labels: {
          usePointStyle: true,
          color: '#242424',
          font: {
            family: 'Pretendard',
            size: 12,
            weight: 500,
          },
        },
      },
    },
  };

  return (
    <div className={cn('', className)}>
      <Doughnut data={data} options={options} />
    </div>
  );
};

export default StockChart;
